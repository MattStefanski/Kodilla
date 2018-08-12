/*
 * Created by Matt Stefanski on 8/4/18 9:59 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 9:59 AM
 */

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza{

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with:\ntomato souce\ncheese";
    }
}
