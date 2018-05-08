/*
 * Created by Matt Stefanski on 5/8/18 12:57 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:57 AM
 */

package com.kodilla.good.patterns.challenges;

public class CompleteOrder {

    public  boolean completed(Order order,User buyer, User seller){
        boolean stockOK=true;

        for (Product prod: buyer.getBasket()){
            if(!seller.getOffer().contains(prod)) {
                stockOK = false;
            }
        }

        return stockOK;
    }



}
