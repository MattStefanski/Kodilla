/*
 * Created by Matt Stefanski on 5/8/18 11:18 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 11:18 PM
 */

package com.kodilla.good.patterns.food.producers;

import com.kodilla.good.patterns.food.stock.Product;
import com.kodilla.good.patterns.food.stock.Stock;
import java.math.BigDecimal;

public class GlutenFreeShop extends Producer {

    public GlutenFreeShop(Stock stock) {
        super(stock);
    }

    @Override
    public BigDecimal calculatePrice(Product product, BigDecimal volume) {
        return super.calculatePrice(product, volume);
    }

    @Override
    public void process(Stock stock, Product product, String volume) {
        if (stock.checkIfAvailable(new Product("Bread", 3234), volume)) {
            System.out.println("Producer: GlutenFreeShop" +
                    "\nSending request: " +
                    "\n Product: " + product.getName()
                    + "\n Price: " + stock.getStock().get(product).get("Price")
                    + "\n Voume: " + stock.getStock().get(product).get("Volume")
                    + "\n Total order value: " + calculatePrice(product, new BigDecimal(volume))
                    + "\nStatus: COMPLETED\n"
            );
            stock.removeProduct(product, new BigDecimal(volume));
        } else {
            System.out.println("Producer: GlutenFreeShop" +
                    "\nSending request: " +
                    "\n Product: " + product.getName()
                    + "\n Price: " + stock.getStock().get(product).get("Price")
                    + "\n Voume: " + stock.getStock().get(product).get("Volume")
                    + "\nStatus: FAILED"
            );
            System.out.println("Reason: Out of stock! Available quantity: " + stock.getStock().get(product).get("Volume"));
        }
    }
}
