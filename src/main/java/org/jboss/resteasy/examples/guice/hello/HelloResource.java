package org.jboss.resteasy.examples.guice.hello;

import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource {
    @Inject
    private IGreeterService greeter;

    public HelloResource() {
    }

    @GET
    @Path("{name}")
    public String hello(@PathParam("name") final String name) {
        return greeter.greet(name);
    }
}
