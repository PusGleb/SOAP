package com.epam.soap.endpoint;

import com.epam.soap.ws.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by Hleb_Pus on 7/26/2017.
 */

//Endpoint publisher
public class HelloWorldPublisher {

    // https://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example-document-style/

    /*
     *   Document style requires extra classes to run, you can use “wsgen” to generate all necessary Java artifacts (mapping classes, wsdl or xsd schema).
     *   For this need to Go to target/classes in terminal and run :
     *   wsgen -keep -cp . com.epam.soap.ws.HelloWorldImpl
     *       -verbose - show additional information
     *       -keep - don't remove generated stuff
     *       -cp . -classpatch is in current location
     *   It will generate two classes, copy it to your “package.jaxws” folder.
    */

    // test it via URL : http://localhost:9999/ws/hello?wsdl.

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
}
