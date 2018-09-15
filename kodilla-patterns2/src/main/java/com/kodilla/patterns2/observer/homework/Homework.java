/*
 * Created by Matt Stefanski on 8/12/18 10:20 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 9:55 AM
 */

package com.kodilla.patterns2.observer.homework;



public class Homework {

    private Integer Module, Task;
    private String result;
    private boolean accepted = false;

    public Homework(Integer module, Integer task, String result) {
        Module = module;
        Task = task;
        this.result = result;
    }

    public Integer getModule() {
        return Module;
    }

    public Integer getTask() {
        return Task;
    }

    public String getResult() {
        return result;
    }

    public boolean isAccepted() {
        return accepted;
    }
}
