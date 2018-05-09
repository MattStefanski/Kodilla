/*
 * Created by Matt Stefanski on 5/8/18 11:37 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 11:37 AM
 */

package com.kodilla.good.patterns.food.store;

import java.util.Objects;

public class Product {

    private String productName;
    private Integer productID;
    private String categoryName;
    private Integer categoryID;

    public Product(String productName, Integer productID, String categoryName, Integer categoryID) {
        this.productName = productName;
        this.productID = productID;
        this.categoryName = categoryName;
        this.categoryID = categoryID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(categoryName, product.categoryName) &&
                Objects.equals(categoryID, product.categoryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID);
    }
}
