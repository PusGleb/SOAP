package com.epam.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Hleb_Pus on 7/26/2017.
 */

//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL) //optional
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);

}
