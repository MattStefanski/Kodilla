/*
 * Created by Matt Stefanski on 8/4/18 10:04 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 10:04 AM
 */

package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithMushrooms extends PizzaDecorator {

    public PizzaWithMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.pizza.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + "\nmushrooms";
    }
}
