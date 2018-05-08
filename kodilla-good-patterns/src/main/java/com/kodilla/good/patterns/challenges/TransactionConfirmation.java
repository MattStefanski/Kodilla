/*
 * Created by Matt Stefanski on 5/4/18 8:20 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/4/18 8:20 PM
 */

package com.kodilla.good.patterns.challenges;


public interface TransactionConfirmation {

    void sendInfoToBuyer(Integer orderID, User buyer, User seller,String orderStatus);

    void sendInfoToSeller(Integer orderID, User buyer, User seller,String orderStatus);


}
