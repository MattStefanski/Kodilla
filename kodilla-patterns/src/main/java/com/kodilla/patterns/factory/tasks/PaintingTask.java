/*
 * Created by Matt Stefanski on 5/19/18 2:59 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 2:59 PM
 */

package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName, color,whatToPaint;
    private boolean executed=false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
