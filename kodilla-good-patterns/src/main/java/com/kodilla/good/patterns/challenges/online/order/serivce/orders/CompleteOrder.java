/*
 * Created by Matt Stefanski on 5/9/18 3:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:54 PM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.orders;

import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;
import com.kodilla.good.patterns.challenges.online.order.serivce.products.Product;

public class CompleteOrder {

    public  boolean checkIfCompleted(User buyer, User seller){
        boolean stockOK=true;
       for (Product prod: buyer.getBasket()){
            if(!seller.getOffer().contains(prod)) {
                stockOK = false;
            }
        }
        return stockOK;
    }



}
