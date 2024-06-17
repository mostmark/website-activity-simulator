package com.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return ActivityGenerator.generateActivity().toString();
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public Activity hello2() {
        return ActivityGenerator.generateActivity();
    }
}
