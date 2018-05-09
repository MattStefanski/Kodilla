/*
 * Created by Matt Stefanski on 5/9/18 3:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:54 PM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.services;


import com.kodilla.good.patterns.challenges.online.order.serivce.orders.CompleteOrder;
import com.kodilla.good.patterns.challenges.online.order.serivce.orders.OrderDto;
import com.kodilla.good.patterns.challenges.online.order.serivce.orders.OrderRetriever;


public class ProductOrderService {




    private CompleteOrder completeOrder;

    public ProductOrderService(final CompleteOrder completeOrder) {
        this.completeOrder = completeOrder;

    }

    public OrderDto process(final OrderRetriever orderRetriever) {

        boolean  orderOK= this.completeOrder.checkIfCompleted(orderRetriever.getBuyer(),orderRetriever.getSeller());

        if(orderOK) {
           InfoService.sendInfo(orderRetriever.getOrd(), Status.Completed);

            return new OrderDto(orderRetriever.getOrd(), true);
        } else {
            InfoService.sendInfo(orderRetriever.getOrd(),Status.Failed);
            return new OrderDto(orderRetriever.getOrd(), false);
        }
    }



}
