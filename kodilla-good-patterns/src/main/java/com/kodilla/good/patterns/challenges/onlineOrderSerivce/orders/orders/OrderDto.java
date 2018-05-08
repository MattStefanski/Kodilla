/*
 * Created by Matt Stefanski on 5/8/18 8:37 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:35 PM
 */

package com.kodilla.good.patterns.challenges.OnlineOrderService.orders;

public class OrderDto {
    Order order;
    boolean status;

    public OrderDto(Order order, boolean status) {
        this.order = order;
        this.status = status;
    }
}
