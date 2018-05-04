/*
 * Created by Matt Stefanski on 4/28/18 3:28 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 3:28 PM
 */

package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x,double y) throws Exception {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}