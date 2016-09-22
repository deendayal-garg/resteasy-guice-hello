/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.resteasy;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jboss.resteasy.examples.guice.hello.HelloModule;
import org.jboss.resteasy.examples.guice.hello.HelloResource;
import org.jboss.resteasy.examples.guice.user.UserResource;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import java.util.HashSet;
import java.util.Set;

/**
 * @author dherik
 */
@ApplicationPath("v2")
public class ApplicationV2RS extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public ApplicationV2RS(@Context ServletContext servletContext) {
    }

    @Override
    public Set<Object> getSingletons() {
        Injector injector = Guice.createInjector(new HelloModule());

        HelloResource helloResource = injector.getInstance(HelloResource.class);
        UserResource userResource = injector.getInstance(UserResource.class);
        singletons.add(helloResource);
        singletons.add(userResource);
        return singletons;
    }
}
