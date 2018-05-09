/*
 * Created by Matt Stefanski on 5/9/18 10:47 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;


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
