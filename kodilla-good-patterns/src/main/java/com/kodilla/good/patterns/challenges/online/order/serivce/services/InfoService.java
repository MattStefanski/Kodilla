/*
 * Created by Matt Stefanski on 5/9/18 3:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:54 PM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.services;

import com.kodilla.good.patterns.challenges.online.order.serivce.orders.Order;
import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;

public class InfoService {

   static void sendInfo(Order order, Status status){
        TransactionConfirmation tcEmail = new EmailConfirmation();
        TransactionConfirmation tcSms = new SmsConfirmation();
        User buyer=order.getBuyer();
        User seller=order.getSeller();
        Integer orderID=order.getOrderID();
        if (!buyer.getPhoneNumber().isEmpty()) {
            tcSms.sendInfoToBuyer(orderID,buyer,seller, order.getStatus());
        }else {
            tcEmail.sendInfoToBuyer(orderID,buyer,seller,order.getStatus());
        }

        if (!seller.getPhoneNumber().isEmpty()) {
            tcSms.sendInfoToSeller(orderID,buyer,seller, order.getStatus());
        }else {
            tcEmail.sendInfoToSeller(orderID,buyer,seller, order.getStatus());
        }
    }
}
