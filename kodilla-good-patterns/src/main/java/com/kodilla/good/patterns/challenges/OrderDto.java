/*
 * Created by Matt Stefanski on 5/8/18 1:49 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 1:49 AM
 */

package com.kodilla.good.patterns.challenges;

public class OrderDto {
    Order order;
    boolean status;

    public OrderDto(Order order, boolean status) {
        this.order = order;
        this.status = status;
    }
}
