/*
 * Created by Matt Stefanski on 5/8/18 2:05 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 2:05 AM
 */

package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.OnlineOrderService.orders.*;
import com.kodilla.good.patterns.challenges.orders.*;

public class OrderApplication {


    public static void main(String[] args) {
        OrderRetriever orderRetriever=new OrderRetriever();
        ProductOrderService pos=new ProductOrderService(new InfoService(),new CompleteOrder(),new Repository());
        pos.process(orderRetriever);
    }
}
