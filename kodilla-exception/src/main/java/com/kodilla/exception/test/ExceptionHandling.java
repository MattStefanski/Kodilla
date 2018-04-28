/*
 * Created by Matt Stefanski on 4/28/18 3:29 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 3:29 PM
 */

package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge sc=new SecondChallenge();
    try {
            sc.probablyIWillThrowException(2,1.5);
        } catch (Exception e) {
        System.out.println("Rise error!");;
        }

    }


}
