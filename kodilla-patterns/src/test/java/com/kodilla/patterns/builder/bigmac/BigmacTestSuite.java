/*
 * Created by Matt Stefanski on 5/19/18 5:23 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 5:23 PM
 */

package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {


    @Test
    public void testGetIngredients(){
        //Given
    Bigmac bigmac= new Bigmac.BigmacBuilder()
            .bun(Bun.NOTSESAME)
            .sauce(Sauce.standard)
            .ingredient(Ingredients.onion)
            .ingredient(Ingredients.bacon)
            .ingredient(Ingredients.cheese)
            .build();

        //When

        int howManyIngredients=bigmac.getIngredients().size();

        //Then

        Assert.assertEquals(3,howManyIngredients);
    }


    @Test
    public void testGetSauce(){
        //Given
        Bigmac bigmac= new Bigmac.BigmacBuilder()
                .bun(Bun.NOTSESAME)
                .sauce(Sauce.standard)
                .ingredient(Ingredients.onion)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.cheese)
                .build();

        //When

        Sauce sauce=bigmac.getSauce();

        //Then

        Assert.assertEquals(Sauce.standard,sauce);
    }


    @Test
    public void testGetBun(){
        //Given
        Bigmac bigmac= new Bigmac.BigmacBuilder()
                .bun(Bun.NOTSESAME)
                .sauce(Sauce.standard)
                .ingredient(Ingredients.onion)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.cheese)
                .build();

        //When

        Bun bun=bigmac.getBun();

        //Then

        Assert.assertEquals(Bun.NOTSESAME,bun);
    }
}
