/*
 * Created by Matt Stefanski on 4/28/18 5:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 5:02 PM
 */

package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport){
        this.departureAirport=departureAirport;
        this.arrivalAirport=arrivalAirport;
    }
    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
