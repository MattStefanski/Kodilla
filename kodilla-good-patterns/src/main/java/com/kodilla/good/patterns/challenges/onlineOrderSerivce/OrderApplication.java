/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce;


import com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders.*;

public class OrderApplication {


    public static void main(String[] args) {
        OrderRetriever orderRetriever=new OrderRetriever();
        ProductOrderService productOrderService=new ProductOrderService(new CompleteOrder(),new Repository());
        productOrderService.process(orderRetriever);
    }
}
