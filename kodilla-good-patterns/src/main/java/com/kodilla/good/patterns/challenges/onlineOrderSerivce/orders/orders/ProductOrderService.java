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

    private Integer orderID;
    private User buyer;
    private User seller;
    private String status;


    private InfoService infoService;
    private CompleteOrder completeOrder;
    private Repository orderRepository;

    public ProductOrderService(final InfoService infoService, final CompleteOrder completOrder, final Repository orderRepository) {
        this.infoService = infoService;
        this.completeOrder = completOrder;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRetriever orderRetriever) {

       boolean  orderOK= completeOrder.completed(orderRetriever.getOrd(),orderRetriever.getBuyer(),orderRetriever.getSeller());

        if(orderOK) {
            infoService.sendInfo(orderRetriever.getOrd(),"completed");
            orderRepository.saveOrder(orderRetriever.getOrd());
            return new OrderDto(orderRetriever.getOrd(), true);
        } else {
            infoService.sendInfo(orderRetriever.getOrd(),"failed");
            return new OrderDto(orderRetriever.getOrd(), false);
        }
    }



}
