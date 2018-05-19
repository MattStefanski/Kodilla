/*
 * Created by Matt Stefanski on 5/11/18 1:10 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/11/18 1:10 PM
 */

package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}
