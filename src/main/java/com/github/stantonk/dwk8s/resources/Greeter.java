package com.github.stantonk.dwk8s.resources;

import com.codahale.metrics.annotation.Timed;
import com.github.stantonk.dwk8s.api.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class Greeter {

    @GET
    @Timed
    public Greeting greet(@QueryParam("name") Optional<String> name) {
        return new Greeting(String.format(
                "Hello from %s, %s!",
                System.getenv("HOSTNAME"),
                name.orElse("Friend")));
    }
}
