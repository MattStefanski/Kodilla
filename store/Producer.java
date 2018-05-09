/*
 * Created by Matt Stefanski on 5/8/18 11:13 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 11:13 AM
 */

package com.kodilla.good.patterns.food.store;

import com.kodilla.good.patterns.challenges.Product;

import java.math.BigDecimal;
import java.util.Hashtable;

abstract class Producer {

  private String name;
  private Integer id;
  private Location location;
  private Hashtable<Product,BigDecimal> stock=null;

    public Producer(String name, Integer id, Location location, Hashtable<Product) {
        this.name = name;
        this.id = id;
        this.location = location;

    }

    protected BigDecimal getProductInStock(Product product){
      return   this.stock.get(product);
    }

    private void setStock(Hashtable<Product, BigDecimal> stock) {
        this.stock = stock;
    }


    abstract  void  process();


}
