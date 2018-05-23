/*
 * Created by Matt Stefanski on 5/19/18 1:00 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 12:42 PM
 */

package com.kodilla.patterns.strategy.social.user;

import com.kodilla.patterns.strategy.social.tools.SocialPublisher;

public class User {

    private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSharingChannel(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
