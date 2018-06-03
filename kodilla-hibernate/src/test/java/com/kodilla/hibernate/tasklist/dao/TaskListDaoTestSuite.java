/*
 * Created by Matt Stefanski on 6/3/18 9:36 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 9:36 AM
 */

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("My Task List", "My first list added to DB ");
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();
        //When
        List<TaskList> readTaskLists = taskListDao.findByListName("My Task List");
        String readTaskListName = readTaskLists.get(0).getListName();

        //Then
        Assert.assertEquals(taskListName, readTaskListName);
        //CleanUp
        taskListDao.delete(readTaskLists.get(0).getId());

    }

}
