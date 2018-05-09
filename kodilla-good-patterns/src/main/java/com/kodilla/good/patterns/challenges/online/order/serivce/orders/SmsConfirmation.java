/*
 * Created by Matt Stefanski on 5/9/18 10:47 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 10:45 AM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;

import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;

public class SmsConfirmation implements TransactionConfirmation {

    @Override
    public void sendInfoToBuyer(Integer orderID, User buyer, User seller, Status status){
        System.out.println("Status of the order number " + orderID +" has changed to "+status);
    }

    @Override
    public void sendInfoToSeller(Integer orderID, User buyer, User seller, Status status){
        System.out.println("Status of the order number " + orderID +" has changed to "+status);
    };
}
