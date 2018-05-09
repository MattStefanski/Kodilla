/*
 * Created by Matt Stefanski on 5/8/18 10:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 10:01 PM
 */

package com.kodilla.good.patterns.food.stock;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Stock {


    private Hashtable<Product, Map<String, BigDecimal>> stock;

    public Stock() {
        this.stock = new Hashtable<Product, Map<String, BigDecimal>>();
    }

    public void addProduct(Product product, BigDecimal price, BigDecimal volume) {
        Map<String, BigDecimal> tmpMap = new HashMap<String, BigDecimal>();
        tmpMap.put("Price", price);
        tmpMap.put("Volume", volume);
        this.stock.put(product, tmpMap);
    }

    public void removeProduct(Product product, BigDecimal volume) {

        this.stock.get(product).get("Volume").subtract(volume);
    }

    public Hashtable<Product, Map<String, BigDecimal>> getStock() {
        return stock;
    }

    public boolean checkIfAvailable(Product product, String volume) {
        return this.stock.containsKey(product) && this.stock.get(product).get("Volume").compareTo(new BigDecimal(volume)) == 1;

    }


}
