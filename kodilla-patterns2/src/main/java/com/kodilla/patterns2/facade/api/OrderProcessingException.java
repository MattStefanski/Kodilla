/*
 * Created by Matt Stefanski on 8/11/18 11:49 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 7:59 PM
 */

package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMISSION_ERROR = "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}