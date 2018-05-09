/*
 * Created by Matt Stefanski on 5/9/18 10:46 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce;


import com.kodilla.good.patterns.challenges.online.order.serivce.orders.CompleteOrder;
import com.kodilla.good.patterns.challenges.online.order.serivce.orders.OrderRetriever;
import com.kodilla.good.patterns.challenges.online.order.serivce.orders.ProductOrderService;
import com.kodilla.good.patterns.challenges.online.order.serivce.orders.Repository;


public class OrderApplication {


    public static void main(String[] args) {
        OrderRetriever orderRetriever=new OrderRetriever();
        ProductOrderService productOrderService=new ProductOrderService(new CompleteOrder(),new Repository());
        productOrderService.process(orderRetriever);
    }
}
