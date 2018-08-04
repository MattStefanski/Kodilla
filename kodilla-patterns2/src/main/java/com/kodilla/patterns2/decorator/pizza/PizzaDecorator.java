/*
 * Created by Matt Stefanski on 8/4/18 9:50 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 9:50 AM
 */

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {

        this.pizza = pizza;

    }

    public BigDecimal getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
