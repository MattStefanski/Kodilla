/*
 * Created by Matt Stefanski on 5/19/18 3:35 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 3:35 PM
 */

package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {


    @Test
    public void testFactoryShopping(){

        //Given
        TaskFactory taskFactory=new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        String taskName = shoppingTask.getTaskName();
        boolean executed = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("FridayShopping",taskName);
        Assert.assertEquals(false,executed);

    }

    @Test
    public void testFactoryDriving(){

        //Given
        TaskFactory taskFactory=new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        String taskName = drivingTask.getTaskName();
        boolean executed = drivingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("Drive",taskName);
        Assert.assertEquals(true,executed);

    }


    @Test
    public void testFactoryPainting(){

        //Given
        TaskFactory taskFactory=new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        String taskName = paintingTask.getTaskName();
        boolean executed = paintingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("Paint",taskName);
        Assert.assertEquals(true,executed);

    }



}
