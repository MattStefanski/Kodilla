/*
 * Created by Matt Stefanski on 5/8/18 10:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 10:02 PM
 */

package com.kodilla.good.patterns.food.stock;

import java.util.Objects;

public class Product {

    private String name;
    private Integer categoryId;

    public Product(String name, Integer categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(categoryId, product.categoryId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(categoryId);
    }
}
