package com.example.helidon;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Simple greeting resource.
 */
@Path("/greet")
public class GreetResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return "Hello World";
    }
}
