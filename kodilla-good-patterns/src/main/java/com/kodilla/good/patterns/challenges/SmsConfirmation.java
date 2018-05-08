/*
 * Created by Matt Stefanski on 5/8/18 12:12 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:12 AM
 */

package com.kodilla.good.patterns.challenges;

public class SmsConfirmation implements TransactionConfirmation {

    @Override
    public void sendInfoToBuyer(Integer orderID, User buyer, User seller, String status){
        System.out.println("Status of the order number " + orderID +" has changed to " + status);
    }

    @Override
    public void sendInfoToSeller(Integer orderID, User buyer, User seller, String status){
        System.out.println("Status of the order number " + orderID +" has changed to " + status);
    };
}
