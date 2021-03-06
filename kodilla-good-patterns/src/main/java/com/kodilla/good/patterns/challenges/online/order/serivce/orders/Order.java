/*
 * Created by Matt Stefanski on 5/9/18 3:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:54 PM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;


import com.kodilla.good.patterns.challenges.online.order.serivce.services.Status;
import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;

public class Order {


    private Status status;
    private Integer orderID;
    private User buyer;
    private User seller;

    public Order(Integer orderID, User buyer, User seller,Status status) {
        this.orderID = orderID;
        this.buyer = buyer;
        this.seller = seller;
        this.status=status;
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

    public Status getStatus() {
        return status;
    }
}
