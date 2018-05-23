/*
 * Created by Matt Stefanski on 5/19/18 11:12 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 11:12 AM
 */

package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {


    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();

        //When

        logger.log("Insert 1");
        logger.log("Insert 2");
        String lastLog = logger.getLastLog();

        //Then
        Assert.assertEquals("Insert 2", lastLog);
    }

}
