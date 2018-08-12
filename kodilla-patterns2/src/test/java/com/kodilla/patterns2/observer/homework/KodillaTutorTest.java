/*
 * Created by Matt Stefanski on 8/12/18 10:21 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 10:21 AM
 */

package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KodillaTutorTest {

    @Test
    public void testUpdate() {
        //Given
        Student mStefanski = new Student(1l, "MStefanski");
        Student jKowalski = new Student(2l, "JKowalski");
        StudentHomeworkQueue studentHomeworkQueueMStefanski = new StudentHomeworkQueue(mStefanski);
        StudentHomeworkQueue studentHomeworkQueueJKowalski = new StudentHomeworkQueue(jKowalski);
        Tutor KKononowicz = new Tutor("Krzysztof Kononowicz");
        Tutor AKwasniewski = new Tutor("Aleksander Kwaśniewski");
        studentHomeworkQueueJKowalski.registerObserver(KKononowicz);
        studentHomeworkQueueMStefanski.registerObserver(AKwasniewski);
        //When
        studentHomeworkQueueJKowalski.addHomework(new Homework(23, 2, "some url1"));
        studentHomeworkQueueJKowalski.addHomework(new Homework(20, 4, "some url2"));

        studentHomeworkQueueMStefanski.addHomework(new Homework(23, 1, "some url1"));
        studentHomeworkQueueMStefanski.addHomework(new Homework(20, 4, "some url2"));
        studentHomeworkQueueMStefanski.addHomework(new Homework(24, 1, "some url3"));
        studentHomeworkQueueMStefanski.addHomework(new Homework(20, 4, "some url4"));
        //Then

        Assert.assertEquals(2, studentHomeworkQueueJKowalski.getHomeworks().size());
        Assert.assertEquals(4, studentHomeworkQueueMStefanski.getHomeworks().size());
    }

}