/*
 * Created by Matt Stefanski on 5/9/18 10:46 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.users;

import com.kodilla.good.patterns.challenges.online.order.serivce.products.Product;

import java.util.ArrayList;

public class User {


    private String phoneNumber;
    private ArrayList<Product> basket;
    private ArrayList<Product> offer;

    public User(String phoneNumber,
                ArrayList<Product> basket,
                ArrayList<Product> offer) {

        this.phoneNumber = phoneNumber;
        this.basket = basket;
        this.offer=offer;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public ArrayList<Product> getOffer() {
        return offer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
