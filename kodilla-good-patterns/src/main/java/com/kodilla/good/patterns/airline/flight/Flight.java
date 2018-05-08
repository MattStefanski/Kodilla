/*
 * Created by Matt Stefanski on 5/8/18 8:11 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 7:59 PM
 */

package com.kodilla.good.patterns.airline.flight;

import java.time.LocalDateTime;
import java.util.*;

public class Flight {


    private Connection connection;
    private Integer flightID;
    private String airline;
    private String flightNumber;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;

    public Flight(Connection connection,
                  Integer flightID,
                  String airline,
                  String flightNumber,
                  LocalDateTime departureDateTime,
                  LocalDateTime arrivalDateTime) {
        this.connection = connection;
        this.flightID = flightID;
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }

    @Override
    public String toString() {
        return "Flight number " + flightNumber +
                " with " + airline +
                " depart from " + connection.getDepartureAirport() +
                " at " + departureDateTime +
                " stops in " + connection.getStops() +
                " is going to " + connection.getArrivalAirport() +
                " according to the schedule land at " + arrivalDateTime + ".";
    }

    public Connection getConnection() {
        return connection;
    }

    public Integer getFlightID() {
        return flightID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(connection, flight.connection) &&
                Objects.equals(flightID, flight.flightID) &&
                Objects.equals(airline, flight.airline) &&
                Objects.equals(flightNumber, flight.flightNumber) &&
                Objects.equals(departureDateTime, flight.departureDateTime) &&
                Objects.equals(arrivalDateTime, flight.arrivalDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, airline);
    }
}
