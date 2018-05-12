/*
 * Created by Matt Stefanski on 5/9/18 2:18 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:18 PM
 */

package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String username;

    public ForumUser() {
        this.username="John Smith";
    }

    public String getUsername() {
        return username;
    }
}
