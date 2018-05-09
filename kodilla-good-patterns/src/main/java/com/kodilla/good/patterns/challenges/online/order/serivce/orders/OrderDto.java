/*
 * Created by Matt Stefanski on 5/9/18 10:47 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;

public class OrderDto {
    private Order order;
    private boolean status;

    public OrderDto(Order order, boolean status) {
        this.order = order;
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isStatus() {
        return status;
    }
}
