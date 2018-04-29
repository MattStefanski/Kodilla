/*
 * Created by Matt Stefanski on 4/28/18 5:00 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 5:00 PM
 */

package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException() {
        System.out.println("Given airport does not exists in database");
    }



}
