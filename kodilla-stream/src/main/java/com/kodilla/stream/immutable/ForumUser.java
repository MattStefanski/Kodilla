/*
 * Created by Matt Stefanski on 4/19/18 11:08 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/19/18 11:08 PM
 */

package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String username;
    private final String realName;


    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }


}
