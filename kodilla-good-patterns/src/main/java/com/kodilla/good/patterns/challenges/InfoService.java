/*
 * Created by Matt Stefanski on 5/8/18 1:52 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 1:52 AM
 */

package com.kodilla.good.patterns.challenges;

public class InfoService {

   static void sendInfo(Order order,String status){
        TransactionConfirmation tcEmail = new EmailConfirmation();
        TransactionConfirmation tcSms = new SmsConfirmation();
        User buyer=order.getBuyer();
        User seller=order.getSeller();
        Integer orderID=order.getOrderID();
        if (!buyer.getPhoneNumber().equals("")) {
            tcSms.sendInfoToBuyer(orderID,buyer,seller, status);
        }else {
            tcEmail.sendInfoToBuyer(orderID,buyer,seller, status);
        }

        if (!seller.getPhoneNumber().equals("")) {
            tcSms.sendInfoToSeller(orderID,buyer,seller, status);
        }else {
            tcEmail.sendInfoToSeller(orderID,buyer,seller, status);
        }
    }
}
