/*
 * Created by Matt Stefanski on 5/8/18 8:11 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 5:39 PM
 */

package com.kodilla.good.patterns.airline.flight;


import java.util.ArrayList;


public class Connection {

    private String departureAirport;
    private String arrivalAirport;
    private ArrayList<String> stops;


    public Connection(String departureAirport, String arrivalAirport, ArrayList<String> stops) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stops = stops;

    }


    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public ArrayList<String> getStops() {
        return stops;
    }


}
