package com.flymonkey.ws;

import javax.jws.WebService;


@WebService(
        endpointInterface = "com.flymonkey.ws.Hello",
        portName = "HelloPort",
        serviceName = "HelloService",
        targetNamespace = "http://www.flymonkey.com/ws/hello"
)
public class HelloImpl implements Hello {
    /**
     * postman请求案例
     * <?xml version="1.0" encoding="utf-8"?>
     * <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     * xmlns:xsd="http://www.w3.org/2001/XMLSchema">
     *     <soap:Body>
     *         <method:greeting xmlns:method="http://www.flymonkey.com/ws/hello">
     *             <name>张三</name>
     *         </method:greeting>
     *     </soap:Body>
     * </soap:Envelope>
     * @param name
     * @return
     */
    public String greeting(String name) {
        return "Hello " + name;
    }

}