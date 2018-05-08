/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;
import com.google.common.collect.Lists;
import com.kodilla.good.patterns.challenges.onlineOrderSerivce.products.product.Product;
import com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User.User;

public class OrderRetriever {


    private Product thinkPad=new Product("Lenovo ThinkPad");
    private Product appleMac=new Product("MacBook");
    private Product samsungS9=new Product("Samsung Galaxy S9");
    private User buyer;
    private User seller;
    private Order ord;

    public OrderRetriever() {
        this.buyer = new User("738237812",Lists.newArrayList(thinkPad,samsungS9), Lists.newArrayList());
        this.seller = new User("3423781343",Lists.newArrayList(),Lists.newArrayList(thinkPad,samsungS9,appleMac));
        this.ord = new Order(124324324,buyer,seller,Status.Completed);
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public Order getOrd() {
        return ord;
    }
}
