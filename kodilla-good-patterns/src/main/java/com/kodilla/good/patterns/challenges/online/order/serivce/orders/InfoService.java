/*
 * Created by Matt Stefanski on 5/9/18 10:47 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;

import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;

public class InfoService {

   static void sendInfo(Order order, Enum status){
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
