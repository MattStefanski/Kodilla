/*
 * Created by Matt Stefanski on 8/6/18 8:10 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 7:02 PM
 */

package com.kodilla.patterns2;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId){
        Random random = new Random();
        return random.nextBoolean();
    }
}
