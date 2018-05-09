/*
 * Created by Matt Stefanski on 5/8/18 11:45 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/8/18 11:45 AM
 */

package com.kodilla.good.patterns.food.store;

public class Location {
    private double georg_x;
    private double georg_y;

    public Location(double georg_x, double georg_y) {
        this.georg_x = georg_x;
        this.georg_y = georg_y;
    }

    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
    double calculateDistance(double georg_x, double georg_y, String unit){

        double theta = georg_x - this.georg_x;
        double dist = Math.sin(deg2rad(georg_y)) * Math.sin(deg2rad(this.georg_y)) + Math.cos(deg2rad(georg_y)) * Math.cos(deg2rad(this.georg_y)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (unit == "K") {
            dist = dist * 1.609344;
        } else if (unit == "N") {
            dist = dist * 0.8684;
        }

        return (dist);
    }

    }
}
