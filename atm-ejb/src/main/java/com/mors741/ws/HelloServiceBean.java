package com.mors741.ws;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class HelloServiceBean {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
