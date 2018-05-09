/*
 * Created by Matt Stefanski on 5/8/18 10:00 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 10:00 PM
 */

package com.kodilla.good.patterns.food.producers;

import com.kodilla.good.patterns.food.stock.*;
import java.math.BigDecimal;

public abstract class Producer {

    private String name;
    private Integer id;
    private Stock stock;

    public Producer(Stock stock) {
        this.name = name;
        this.id = id;
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    public BigDecimal calculatePrice(Product product, BigDecimal Volume) {
        return this.stock.getStock().get(product).get("Price").multiply(this.stock.getStock().get(product).get("Volume"));
    }

    abstract void process(Stock stock, Product product, String volume);

}

