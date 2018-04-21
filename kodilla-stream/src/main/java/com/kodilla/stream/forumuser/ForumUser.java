/*
 * Created by Matt Stefanski on 4/20/18 10:55 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/20/18 10:55 PM
 */

package com.kodilla.stream.forumuser;


import java.time.LocalDate;

public final class ForumUser {

    private  int userID;
    private  String userName;
    private  char sex;
    private  LocalDate birthDate;
    private  int postsNumber;

    public ForumUser(int userID, String userName, char sex,LocalDate birthDate, int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsNumber = postsNumber;
    }

    public char getSex() {
        return sex;
    }

    public int getUserID() {
        return userID;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getAge() {
        return LocalDate.now().getYear()- birthDate.getYear();
    }
}
