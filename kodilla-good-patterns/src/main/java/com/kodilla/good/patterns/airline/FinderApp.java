/*
 * Created by Matt Stefanski on 5/8/18 1:07 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 1:07 PM
 */

package com.kodilla.good.patterns.airline;

        import com.kodilla.good.patterns.airline.flightFinder.FlightFinder;
        import com.kodilla.good.patterns.airline.schedule.FlightRetriver;

public class FinderApp {

    public static void main(String[] args) {
        FlightRetriver flightRetriver = new FlightRetriver();
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.listByDepartureAirport(flightRetriver.getFlightSchedule(), "Warszawa");
        flightFinder.listByArrivalAirport(flightRetriver.getFlightSchedule(), "Londyn");
        flightFinder.listByStopAirport(flightRetriver.getFlightSchedule(), "Radom", "Praga", "Ostrawa");

    }

}
