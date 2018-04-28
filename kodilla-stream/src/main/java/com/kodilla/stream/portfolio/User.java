/*
 * Created by Matt Stefanski on 4/25/18 6:31 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/25/18 6:31 AM
 */

package com.kodilla.stream.portfolio;


public final class User {
    private final String username;
    private final String realName;

    public User(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return username.equals(user.username);
    }
}