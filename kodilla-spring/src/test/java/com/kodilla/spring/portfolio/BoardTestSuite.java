/*
 * Created by Matt Stefanski on 5/11/18 1:24 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/11/18 1:24 PM
 */

package com.kodilla.spring.portfolio;
import org.junit.Test;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardTestSuite  {


    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board =  context.getBean(Board.class);
        board.getDoneList().tasks.add("Zadanie1");
        board.getInProgressList().tasks.add("Zadanie2");
        board.getToDoList().tasks.add("Zadanie3");
        String done=board.getDoneList().tasks.get(0);
        String inProgress=board.getInProgressList().tasks.get(0);
        String toDo=board.getToDoList().tasks.get(0);

        //Then

        assertEquals("Zadanie1",done);
        assertEquals("Zadanie2",inProgress);
        assertEquals("Zadanie3",toDo);

    }
}
