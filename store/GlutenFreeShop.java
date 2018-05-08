/*
 * Created by Matt Stefanski on 5/8/18 12:11 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:11 PM
 */

package com.kodilla.good.patterns.food.store;


import com.kodilla.good.patterns.challenges.Product;

import java.math.BigDecimal;
import java.util.Hashtable;

public class GlutenFreeShop extends Producer {


    public GlutenFreeShop(String name, Integer id, Location location) {
        super(name, id, location);
    }

    @Override
    protected BigDecimal getProductInStock(Product product) {
        return super.getProductInStock(product);
    }

    @Override
    protected void setStock(Hashtable<Product, BigDecimal> stock) {
        super.setStock(stock);
    }

    @Override
    void process() {

    }
}
