/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;

import com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User.User;
enum Status {
    Completed,Failed
}
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
