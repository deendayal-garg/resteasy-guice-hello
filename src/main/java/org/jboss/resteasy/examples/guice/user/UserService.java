/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.resteasy.examples.guice.user;

import com.google.inject.Singleton;

/**
 *
 * @author dherik
 */
@Singleton
public class UserService implements IUserService {

    @Override
    public String getUser(String name) {
        return "user service";
    }
    
}
