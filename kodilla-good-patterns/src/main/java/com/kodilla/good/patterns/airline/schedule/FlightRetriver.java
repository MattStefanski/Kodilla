/*
 * Created by Matt Stefanski on 5/8/18 8:12 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 8:09 PM
 */

package com.kodilla.good.patterns.airline.schedule;

import com.google.common.collect.Lists;
import com.kodilla.good.patterns.airline.flight.Connection;
import com.kodilla.good.patterns.airline.flight.Flight;


import java.time.LocalDateTime;
import java.util.Hashtable;

public class FlightRetriver {


    private FlightSchedule flightSchedule;

    Connection waw_krk = new Connection("Warszawa", "Kraków", Lists.newArrayList("Poznan", "Radom"));
    Flight flight1 = new Flight(waw_krk, 3422, "Air Koryo", "KR342", LocalDateTime.of(2018, 5, 14, 13, 45, 0),
            LocalDateTime.of(2018, 5, 14, 15, 55, 0));
    Connection bdg_gtw = new Connection("Bydgoszcz", "Londyn", Lists.newArrayList("Świebodzin", "Szczecin"));
    Flight flight2 = new Flight(bdg_gtw, 3432, "Lufthansa", "LH365", LocalDateTime.of(2018, 5, 12, 11, 30, 0),
            LocalDateTime.of(2018, 5, 12, 14, 48, 0));
    Connection rdo_prg = new Connection("Radom", "Praga", Lists.newArrayList("Ostrawa"));
    Flight flight3 = new Flight(rdo_prg, 5432, "Praga", "CA553", LocalDateTime.of(2018, 5, 13, 16, 35, 0),
            LocalDateTime.of(2018, 5, 13, 18, 15, 0));


    public FlightRetriver() {

        this.flightSchedule = new FlightSchedule(new Hashtable<Integer, Flight>());
        this.flightSchedule.addFlight(flight1);
        this.flightSchedule.addFlight(flight2);
        this.flightSchedule.addFlight(flight3);

    }

    ;

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }
}
