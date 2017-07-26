package com.epam.soap.ws;

import javax.jws.WebService;

/**
 * Created by Hleb_Pus on 7/26/2017.
 */

//Service Implementation
@WebService(endpointInterface = "com.epam.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}
