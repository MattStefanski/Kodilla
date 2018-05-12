/*
 * Created by Matt Stefanski on 5/11/18 9:13 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/11/18 9:13 AM
 */

package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator= context.getBean(Calculator.class);
        //When
        double addTest = calculator.add(3,4);
        double subTest = calculator.sub(5,3);
        double mulTest = calculator.mul(3,5);
        double divTest = calculator.div(15,5);
        //Then
        Assert.assertEquals(7.00, addTest,0);
        Assert.assertEquals(2.00, subTest,0);
        Assert.assertEquals(15.00,mulTest,0);
        Assert.assertEquals(3,divTest,0);
    }

}
