package com.flymonkey.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(
        name = "HelloWS",
        targetNamespace = "http://www.flymonkey.com/ws/hello"
)
public interface Hello {
    @WebMethod
    String greeting(@WebParam(name = "name") String name);
}