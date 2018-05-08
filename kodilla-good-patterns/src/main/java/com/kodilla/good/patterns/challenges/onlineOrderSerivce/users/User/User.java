/*
 * Created by Matt Stefanski on 5/8/18 8:42 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User;

import com.kodilla.good.patterns.challenges.onlineOrderSerivce.products.product.Product;

import java.util.ArrayList;

public class User {

    private int userID;
    private String userName;
    private String userSurname;
    private String email;
    private String adress;
    private String phoneNumber;
    private ArrayList<Product> basket;
    private ArrayList<Product> offer;

    public User(int userID,
                String userName,
                String userSurname,
                String email,
                String adress,
                String phoneNumber,
                ArrayList<Product> basket,
                ArrayList<Product> offer) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.email = email;
        this.adress = adress;
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

    public String getEmail() {
        return email;
    }
}
