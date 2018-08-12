/*
 * Created by Matt Stefanski on 8/12/18 10:20 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/12/18 9:58 AM
 */

package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObservers();

    void removeObserver(Observer observer);
}
