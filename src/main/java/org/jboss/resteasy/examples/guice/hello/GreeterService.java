package org.jboss.resteasy.examples.guice.hello;

import com.google.inject.Singleton;

@Singleton
public class GreeterService implements IGreeterService {
    public String greet(final String name) {
        return "Hello " + name;
    }
}
