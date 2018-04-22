/*
 * Created by Matt Stefanski on 4/21/18 10:43 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/21/18 10:43 AM
 */

package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {
        //Given
        BigDecimal expectedPopulation = new BigDecimal("565453678");

        //When
        World world = new World();
        BigDecimal realPopulation = world.getPeopleQuantity(world.continentList);


        //Then

        Assert.assertEquals(expectedPopulation, realPopulation);
    }

}
