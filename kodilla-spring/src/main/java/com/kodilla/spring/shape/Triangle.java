/*
 * Created by Matt Stefanski on 5/9/18 2:15 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:15 PM
 */

package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "This is a triangle.";
    }
}