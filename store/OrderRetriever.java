/*
 * Created by Matt Stefanski on 5/8/18 12:17 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:17 PM
 */

package com.kodilla.good.patterns.food.store;



public class OrderRetriever {


    com.kodilla.good.patterns.challenges.Product thinkPad=new com.kodilla.good.patterns.challenges.Product("Lenovo ThinkPad");
    com.kodilla.good.patterns.challenges.Product appleMac=new com.kodilla.good.patterns.challenges.Product("MacBook");
    com.kodilla.good.patterns.challenges.Product samsungS9=new Product("Samsung Galaxy S9");
    private User buyer;
    private User seller;
    private Order ord;

    public OrderRetriever() {
        this.buyer = new User(4324,"Roman","Kluska","kluska@gmail.com", "Szczebrzeszyn","738237812", Lists.newArrayList(thinkPad,samsungS9), Lists.newArrayList());
        this.seller = new User(4323,"Katarzyna","Kowalska","kowalska@gmail.com", "Radom","3423781343",Lists.newArrayList(),Lists.newArrayList(thinkPad,samsungS9,appleMac));
        this.ord = new Order(124324324,buyer,seller);
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public Order getOrd() {
        return ord;
    }
}
