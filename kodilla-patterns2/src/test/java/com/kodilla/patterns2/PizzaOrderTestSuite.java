/*
 * Created by Matt Stefanski on 8/4/18 10:08 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 10:08 AM
 */

package com.kodilla.patterns2;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {


    @Test
    public void testPizzaWithCucumberPrice() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithCucumber(pizza);
        //When
        BigDecimal pizzaWithCucumberPrice = pizza.getPrice();

        //Then
        assertEquals(new BigDecimal(18), pizzaWithCucumberPrice);
    }

    @Test
    public void testPizzaWithCucumberDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithCucumber(pizza);
        //When
        String pizzaDesc=pizza.getDescription();

        //Then
        assertEquals("Pizza with:\n" +
                "tomato souce\n" +
                "cheese\n" +
                "cucumber",pizzaDesc);
    }


    @Test
    public void testPizzaWithCucumberAndOnionPrice() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithCucumber(pizza);
        pizza = new PizzaWithOnion(pizza);
        //When
        BigDecimal pizzaWithCucumberAndOnionPrice = pizza.getPrice();

        //Then
        assertEquals(new BigDecimal(21), pizzaWithCucumberAndOnionPrice);
    }

    @Test
    public void testPizzaWithCucumberAndOnionDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithCucumber(pizza);
        pizza = new PizzaWithOnion(pizza);
        //When
        String pizzaDesc=pizza.getDescription();

        //Then
        assertEquals("Pizza with:\n" +
                "tomato souce\n" +
                "cheese\n" +
                "cucumber\n"+
                "onion",pizzaDesc);
    }


    @Test
    public void testPizzaWithOnionAndMushroomsPrice() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithOnion(pizza);
        pizza = new PizzaWithMushrooms(pizza);
        //When
        BigDecimal pizzaWithOnionAndMashroomsPrice = pizza.getPrice();

        //Then
        assertEquals(new BigDecimal(21),  pizzaWithOnionAndMashroomsPrice);
    }

    @Test
    public void testPizzaWithOnionAndMushroomsDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaWithOnion(pizza);
        pizza = new PizzaWithMushrooms(pizza);
        //When
        String pizzaDesc=pizza.getDescription();

        //Then
        assertEquals("Pizza with:\n" +
                "tomato souce\n" +
                "cheese\n" +
                "onion\n"+
                "mushrooms",pizzaDesc);
    }




}
