/*
 * Created by Matt Stefanski on 8/12/18 10:20 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 10:19 AM
 */

package com.kodilla.patterns2.observer.homework;


public class Tutor implements Observer {

    private String tutorName;
    private int updateCount = 0;


    public Tutor(String tutorName) {
        this.tutorName = tutorName;
    }

    @Override
    public void update(StudentHomeworkQueue studentHomeworkQueue) {
        System.out.println(String.format("Student: %1$s add task %2$d from module %3$d.",
                studentHomeworkQueue.getStudent().getUserName(), studentHomeworkQueue.getHomeworks().get(studentHomeworkQueue.getHomeworks().size() - 1).getTask(),
                studentHomeworkQueue.getHomeworks().get(studentHomeworkQueue.getHomeworks().size() - 1).getModule()));

        updateCount++;
    }

    public String getTutorName() {
        return tutorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
