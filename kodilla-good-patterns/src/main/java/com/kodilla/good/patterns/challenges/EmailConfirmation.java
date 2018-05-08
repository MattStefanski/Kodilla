/*
 * Created by Matt Stefanski on 5/8/18 12:18 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:18 AM
 */

package com.kodilla.good.patterns.challenges;

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
