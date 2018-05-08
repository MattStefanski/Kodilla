/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;

public class OrderDto {
    Order order;
    boolean status;

    public OrderDto(Order order, boolean status) {
        this.order = order;
        this.status = status;
    }
}
