/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;


import com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User.User;

public class ProductOrderService {




    private CompleteOrder completeOrder;
    private Repository orderRepository;

    public ProductOrderService(final CompleteOrder completeOrder, final Repository orderRepository) {
        this.completeOrder = completeOrder;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRetriever orderRetriever) {

        boolean  orderOK= this.completeOrder.checkIfCompleted(orderRetriever.getBuyer(),orderRetriever.getSeller());

        if(orderOK) {
           InfoService.sendInfo(orderRetriever.getOrd(),Status.Completed);
            orderRepository.saveOrder(orderRetriever.getOrd());
            return new OrderDto(orderRetriever.getOrd(), true);
        } else {
            InfoService.sendInfo(orderRetriever.getOrd(),Status.Failed);
            return new OrderDto(orderRetriever.getOrd(), false);
        }
    }



}
