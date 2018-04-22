/*
 * Created by Matt Stefanski on 4/21/18 10:07 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/21/18 10:07 AM
 */

package com.kodilla.stream.world;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;


public class World {


    Country poland = new Country(new BigDecimal("38298013"));
    Country germany = new Country(new BigDecimal("84391931"));
    Country uk = new Country(new BigDecimal("38298017"));
    Continent europe = new Continent(Lists.newArrayList(poland, germany, uk));
    Country mexico = new Country(new BigDecimal("120000313"));
    Country usa = new Country(new BigDecimal("250032451"));
    Country canada = new Country(new BigDecimal("34432953"));
    Continent northAmerica = new Continent(Lists.newArrayList(mexico, usa, canada));

    List<Continent> continentList = Lists.newArrayList(europe, northAmerica);


    public BigDecimal getPeopleQuantity(List<Continent> continentList) {
        return continentList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }


}
