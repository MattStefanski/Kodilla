/*
 * Created by Matt Stefanski on 5/19/18 3:00 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 3:00 PM
 */

package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName,where, using;
    private boolean executed=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;

    }

    public void executeTask(){
        this.executed=true;
    }

    public String getTaskName(){
        return this.taskName;
    }


    public boolean isTaskExecuted(){
        return this.executed;
    }



}
