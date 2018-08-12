/*
 * Created by Matt Stefanski on 8/11/18 11:48 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 6:56 PM
 */

package com.kodilla.patterns2.facade;

public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
