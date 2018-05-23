/*
 * Created by Matt Stefanski on 5/19/18 2:43 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 2:43 PM
 */

package com.kodilla.patterns.factory.tasks;

public interface Task {

    void executeTask();

    String getTaskName();

    boolean isTaskExecuted();


}
