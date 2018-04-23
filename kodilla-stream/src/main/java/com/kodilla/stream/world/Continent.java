/*
 * Created by Matt Stefanski on 4/21/18 10:06 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/21/18 10:06 AM
 */

package com.kodilla.stream.world;
import java.util.*;
import java.util.Map;
public class Continent {

    private final List<Country> countriesList;

    public Continent(List<Country> countriesList) {
        this.countriesList = countriesList;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
