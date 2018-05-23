/*
 * Created by Matt Stefanski on 5/19/18 2:58 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 2:58 PM
 */

package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private String taskName, whatToBuy;
    private double quantity;
    private boolean executed=false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
