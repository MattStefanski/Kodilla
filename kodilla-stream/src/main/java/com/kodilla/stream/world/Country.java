/*
 * Created by Matt Stefanski on 4/21/18 10:06 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/21/18 10:06 AM
 */

package com.kodilla.stream.world;
import java.math.BigDecimal;

public class Country {


    private final BigDecimal population;

    public Country( BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }


}
