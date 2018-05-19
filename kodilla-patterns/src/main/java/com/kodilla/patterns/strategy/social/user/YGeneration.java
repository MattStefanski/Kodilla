/*
 * Created by Matt Stefanski on 5/19/18 1:00 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 12:43 PM
 */

package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.tools.FacebookPublisher;

public class YGeneration extends User {

    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
