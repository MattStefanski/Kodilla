/*
 * Created by Matt Stefanski on 5/9/18 3:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/9/18 2:54 PM
 */

package com.kodilla.good.patterns.challenges.online.order.serivce.services;


import com.kodilla.good.patterns.challenges.online.order.serivce.users.User;

public interface TransactionConfirmation {

    void sendInfoToBuyer(Integer orderID, User buyer, User seller, Status orderStatus);

    void sendInfoToSeller(Integer orderID, User buyer, User seller,Status orderStatus);


}
