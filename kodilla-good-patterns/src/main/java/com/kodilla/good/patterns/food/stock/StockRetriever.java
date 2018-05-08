/*
 * Created by Matt Stefanski on 5/8/18 10:05 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 10:05 PM
 */

package com.kodilla.good.patterns.food.stock;

import java.math.BigDecimal;

public class StockRetriever {

    private Product bread = new Product("Bread", 3234);
    private Product carrot = new Product("Carrot", 34231);
    private Product vegetableOil = new Product("Vegetable Oil", 34421);
    private Stock stock = new Stock();

    public StockRetriever() {
        this.stock.addProduct(bread, new BigDecimal("1.98"), new BigDecimal("48.00"));
        this.stock.addProduct(carrot, new BigDecimal("1.50"), new BigDecimal("1000.00"));
        this.stock.addProduct(vegetableOil, new BigDecimal("13.00"), new BigDecimal("118.00"));
    }

    public Stock getStock() {
        return stock;
    }
}
