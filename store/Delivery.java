/*
 * Created by Matt Stefanski on 5/8/18 11:56 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 11:56 AM
 */

package com.kodilla.good.patterns.food.store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;

public class Delivery {

    private String name;
    private Integer id;
    private Hashtable<ArrayList<Integer>,Double> priceList;

    public Delivery(String name, Integer id, Hashtable<ArrayList<Integer>, Double> priceList) {
        this.name = name;
        this.id = id;
        this.priceList = priceList;
    }


    double computePrice(double distance){

    }
}
