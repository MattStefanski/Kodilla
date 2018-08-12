/*
 * Created by Matt Stefanski on 8/12/18 10:20 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 9:53 AM
 */

package com.kodilla.patterns2.observer.homework;



public class Student {


    private Long userId;
    private String userName;

    public Student(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
