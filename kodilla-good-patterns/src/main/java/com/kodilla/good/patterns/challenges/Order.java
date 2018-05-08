/*
 * Created by Matt Stefanski on 5/8/18 1:10 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 1:10 AM
 */

package com.kodilla.good.patterns.challenges;

public class Order {

    private Integer orderID;
    private User buyer;
    private User seller;

    public Order(Integer orderID, User buyer, User seller) {
        this.orderID = orderID;
        this.buyer = buyer;
        this.seller = seller;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }
}
