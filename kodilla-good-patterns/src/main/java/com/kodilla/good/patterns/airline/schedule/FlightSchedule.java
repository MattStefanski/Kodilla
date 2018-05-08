/*
 * Created by Matt Stefanski on 5/8/18 8:12 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 5:54 PM
 */

package com.kodilla.good.patterns.airline.schedule;

import com.kodilla.good.patterns.airline.flight.Flight;

import java.util.Hashtable;

public class FlightSchedule {


    private Hashtable<Integer, Flight> schedule;


    public FlightSchedule(Hashtable<Integer, Flight> schedule) {
        this.schedule = schedule;
    }

    public Hashtable<Integer, Flight> getSchedule() {
        return schedule;
    }


    public void addFlight(Flight flight) {
        this.schedule.put(flight.getFlightID(), flight);

    }


}
