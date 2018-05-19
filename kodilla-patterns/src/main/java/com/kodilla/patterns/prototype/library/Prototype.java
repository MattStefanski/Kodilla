/*
 * Created by Matt Stefanski on 5/19/18 11:35 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 11:35 AM
 */

package com.kodilla.patterns.prototype.library;


public class Prototype<T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}

