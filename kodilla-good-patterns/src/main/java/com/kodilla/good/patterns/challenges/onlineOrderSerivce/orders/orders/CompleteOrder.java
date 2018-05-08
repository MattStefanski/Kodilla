/*
 * Created by Matt Stefanski on 5/8/18 8:37 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:35 PM
 */

package com.kodilla.good.patterns.challenges.OnlineOrderService.orders;

import com.kodilla.good.patterns.challenges.product.Product;
import com.kodilla.good.patterns.challenges.User.User;

public class CompleteOrder {

    public  boolean completed(Order order, User buyer, User seller){
        boolean stockOK=true;

        for (Product prod: buyer.getBasket()){
            if(!seller.getOffer().contains(prod)) {
                stockOK = false;
            }
        }
        return stockOK;
    }



}
