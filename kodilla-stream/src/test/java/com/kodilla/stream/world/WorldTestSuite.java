/*
 * Created by Matt Stefanski on 4/21/18 10:43 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/21/18 10:43 AM
 */

package com.kodilla.stream.world;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {

@Test

    public void testGetPeopleQuantity(){
    //Given
    Country poland=new Country(new BigDecimal("38298013"));
    Country germany=new Country(new BigDecimal("84391931"));
    Country uk=new Country(new BigDecimal("38298017"));
    Continent europe=new Continent(Lists.newArrayList(poland,germany,uk));
    Country mexico=new Country(new BigDecimal("120000313"));
    Country usa= new Country(new BigDecimal("250032451"));
    Country canada=new Country(new BigDecimal("34432953"));
    Continent northAmerica=new Continent(Lists.newArrayList(mexico,usa,canada));

    World world=new World(Lists.newArrayList(europe,northAmerica));

    //When
    BigDecimal realPopulation = BigDecimal.ZERO;
    for(Continent cont: world.getWorld()){
        for(Country coutry :cont.getCountriesList()) {


            realPopulation = realPopulation.add(coutry.getPeopleQuantity());
        }
    }

    //Then
    BigDecimal expectedPopulation = new BigDecimal("565453678");
    Assert.assertEquals(expectedPopulation, realPopulation);
}

}
