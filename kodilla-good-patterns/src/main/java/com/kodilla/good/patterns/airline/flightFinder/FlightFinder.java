/*
 * Created by Matt Stefanski on 5/8/18 8:14 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:05 PM
 */

package com.kodilla.good.patterns.airline.flightFinder;


import com.kodilla.good.patterns.airline.schedule.FlightSchedule;

public class FlightFinder {


    public void listByDepartureAirport(FlightSchedule schedule, String departureAirport) {

        schedule.getSchedule()
                .entrySet()
                .stream()
                .filter(m -> m.getValue().getConnection().getDepartureAirport() == departureAirport)
                .forEach(m -> System.out.println(m.getValue().toString()));

    }


    public void listByArrivalAirport(FlightSchedule schedule, String arrivalAirport) {

        schedule.getSchedule()
                .entrySet()
                .stream()
                .filter(m -> m.getValue().getConnection().getArrivalAirport() == arrivalAirport)
                .forEach(m -> System.out.println(m.getValue().toString()));

    }

    public void listByStopAirport(FlightSchedule schedule,String departureAirport, String arrivalAirport, String stopAirport) {

        schedule.getSchedule()
                .entrySet()
                .stream()
                .filter(m -> m.getValue().getConnection().getDepartureAirport() == departureAirport)
                .filter(m -> m.getValue().getConnection().getArrivalAirport() == arrivalAirport)
                .filter(m -> m.getValue().getConnection().getStops().contains(stopAirport))
                .forEach(m -> System.out.println(m.getValue().toString()));

    }


}