/*
 * Created by Matt Stefanski on 5/8/18 12:06 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 12:06 PM
 */

package com.kodilla.good.patterns.food.store;

import java.math.BigDecimal;

public class Payment {

    private BigDecimal value;
    private Integer receiverID;
    private String receiverBankAccount;
    private String paymentTitle;
    private String reveiverDetails;

    public Payment(BigDecimal value, Integer receiverID, String receiverBankAccount, String paymentTitle, String reveiverDetails) {
        this.value = value;
        this.receiverID = receiverID;
        this.receiverBankAccount = receiverBankAccount;
        this.paymentTitle = paymentTitle;
        this.reveiverDetails = reveiverDetails;
    }

    void process(){

    };
}
