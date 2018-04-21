/*
 * Created by Matt Stefanski on 4/20/18 10:55 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/20/18 10:55 PM
 */

package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {


    private final List<ForumUser> userList;


    public Forum () {
        this.userList=new ArrayList<ForumUser>();
        userList.add(new ForumUser(1233, "User1", 'M', LocalDate.of(1991, 2, 12), 10));
        userList.add(new ForumUser(1513, "User2", 'K', LocalDate.of(1994, 2, 26), 12));
        userList.add(new ForumUser(1523, "User3", 'M', LocalDate.of(1996, 3, 8), 120));
        userList.add(new ForumUser(1543, "User4", 'K', LocalDate.of(1981, 11, 3), 81));
        userList.add(new ForumUser(11243, "User5", 'K', LocalDate.of(1989, 3, 4), 1));

    }

    public List<ForumUser> getUserList() {
        return userList;
    }


}


