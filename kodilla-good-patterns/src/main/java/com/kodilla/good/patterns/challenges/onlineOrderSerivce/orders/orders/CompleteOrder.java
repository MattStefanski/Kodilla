/*
 * Created by Matt Stefanski on 5/8/18 8:40 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:38 PM
 */

package com.kodilla.good.patterns.challenges.onlineOrderSerivce.orders.orders;

import com.kodilla.good.patterns.challenges.onlineOrderSerivce.products.product.Product;
import com.kodilla.good.patterns.challenges.onlineOrderSerivce.users.User.User;

public class CompleteOrder {

    public  boolean checkIfCompleted(User buyer, User seller){
        boolean stockOK=true;
      //  for (Product prod: buyer.getBasket()){
       //     if(!seller.getOffer().contains(prod)) {
         //       stockOK = false;
          //  }
     //   }
        return stockOK;
    }



}
