package com.pm.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @Path("/welcome")
    @GET
    public String welcomeMessage(){
        return "Hi Welcome to K8s";
    }

    @Path("/welcome2")
    @GET
    public String welcomeMessage3(){
        return "Hi Welcome3 to K8s";
    }

    @Path("/welcome3")
    @GET
    public String welcomeMessage4(){
        return "Hi Welcome3 to K8s";
    }
}