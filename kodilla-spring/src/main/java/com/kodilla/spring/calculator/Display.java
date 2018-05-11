/*
 * Created by Matt Stefanski on 5/11/18 9:05 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/11/18 9:05 AM
 */

package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    void displayValue(double val){
        System.out.println(val);
    }

}
