/*
 * Created by Matt Stefanski on 5/8/18 8:37 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:35 PM
 */

package com.kodilla.good.patterns.challenges.OnlineOrderService.orders;


import com.kodilla.good.patterns.challenges.User.User;

public interface TransactionConfirmation {

    void sendInfoToBuyer(Integer orderID, User buyer, User seller, String orderStatus);

    void sendInfoToSeller(Integer orderID, User buyer, User seller,String orderStatus);


}
