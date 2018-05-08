/*
 * Created by Matt Stefanski on 5/8/18 9:59 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 9:59 PM
 */

package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.producers.ExtraFoodShop;
import com.kodilla.good.patterns.food.producers.GlutenFreeShop;
import com.kodilla.good.patterns.food.stock.Product;
import com.kodilla.good.patterns.food.stock.StockRetriever;

public class OrderApplication {

    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new StockRetriever().getStock());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new StockRetriever().getStock());

        extraFoodShop.process(extraFoodShop.getStock(), new Product("Bread", 3234), "4");
        glutenFreeShop.process(glutenFreeShop.getStock(), new Product("Vegetable Oil", 34421), "129");
    }
}
