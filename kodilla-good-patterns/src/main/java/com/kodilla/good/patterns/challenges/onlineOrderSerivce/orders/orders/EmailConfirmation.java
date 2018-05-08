/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;

import com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User.User;

public class EmailConfirmation implements TransactionConfirmation {

    @Override
    public void sendInfoToBuyer(Integer orderID, User buyer, User seller, String status){
        System.out.println("Status of the order number " + orderID +" has changed to " + status);
    }

    @Override
    public void sendInfoToSeller(Integer orderID, User buyer, User seller, String status){
        System.out.println("Status of the order number " + orderID +" has changed to " + status);
    }
}
