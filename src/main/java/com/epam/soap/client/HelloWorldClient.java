package com.epam.soap.client;

import com.epam.soap.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by Hleb_Pus on 7/26/2017.
 */
public class HelloWorldClient {

    // before running need to run HelloWorldPublisher

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.soap.epam.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("TEST !!!"));

    }
}
