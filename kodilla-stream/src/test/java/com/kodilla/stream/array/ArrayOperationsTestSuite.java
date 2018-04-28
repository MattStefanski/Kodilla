/*
 * Created by Matt Stefanski on 4/23/18 11:01 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/23/18 11:01 PM
 */

package com.kodilla.stream.array;

import org.junit.*;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        double avg = 2;

        //When
        int[] sampleArray = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        double results = ArrayOperations.getAverage(sampleArray);

        //Then
        Assert.assertEquals(avg, results, 0);


    }
}
