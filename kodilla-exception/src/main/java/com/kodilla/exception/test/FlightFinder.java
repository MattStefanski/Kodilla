/*
 * Created by Matt Stefanski on 4/28/18 5:04 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 5:04 PM
 */
package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;



public class FlightFinder {

    void flightFind(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightChecker = new HashMap<String, Boolean>();
        flightChecker.put("KRK", Boolean.TRUE);
        flightChecker.put("WAW", Boolean.TRUE);
        flightChecker.put("LAX", Boolean.TRUE);
        flightChecker.put("AMS", Boolean.FALSE);
        flightChecker.put("NRT", Boolean.TRUE);
        flightChecker.put("LHR", Boolean.TRUE);



            if (flightChecker.containsKey(flight.getArrivalAirport())) {
                System.out.println("The route does exists");
            } else {
                throw new RouteNotFoundException();
            }



    }

    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder ff = new FlightFinder();

        ff.flightFind(new Flight("LAX", "JFK"));


    }

}
