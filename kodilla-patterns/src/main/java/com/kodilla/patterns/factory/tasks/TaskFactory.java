/*
 * Created by Matt Stefanski on 5/19/18 3:05 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 3:05 PM
 */

package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Drive","LA","Car");
            case PAINTING:
                return new PaintingTask("Paint","Blue","Wall");
            case SHOPPING:
                return new ShoppingTask("FridayShopping","Bread,milk",3.00);
            default:
                return null;
        }

    }

}
