/*
 * Created by Matt Stefanski on 6/3/18 9:28 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 9:28 AM
 */

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {

    List<TaskList> findByListName(String listName);

}
