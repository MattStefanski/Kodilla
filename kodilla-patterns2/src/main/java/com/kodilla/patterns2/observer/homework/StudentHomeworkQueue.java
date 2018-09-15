/*
 * Created by Matt Stefanski on 8/12/18 10:20 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 10:03 AM
 */

package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;


public class StudentHomeworkQueue implements Observable {

    private Student student;
    private List<Observer> observers = new ArrayList<Observer>();
    private List<Homework> homeworks = new ArrayList<Homework>();

    public StudentHomeworkQueue(Student student) {
        this.student = student;
    }

    public void addHomework(Homework homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.add(observer);

    }

    public Student getStudent() {
        return student;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }
}
