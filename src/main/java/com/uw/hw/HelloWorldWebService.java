package com.uw.hw;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
@Path("/hellows")
public class HelloWorldWebService {

    public HelloWorldWebService() {
        super();
        // TODO Auto-generated constructor stub
    }

    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello";
    }
}
