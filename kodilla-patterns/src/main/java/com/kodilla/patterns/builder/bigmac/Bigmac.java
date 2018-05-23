/*
 * Created by Matt Stefanski on 5/19/18 5:03 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 5:03 PM
 */

package com.kodilla.patterns.builder.bigmac;

import java.util.List;
import java.util.ArrayList;

public class Bigmac   {

    private final Bun bun;
    private final Sauce sauce;
    private final List<Ingredients> ingredients;

    private Bigmac(final Bun bun,final Sauce sauce,final List<Ingredients> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = new ArrayList<Ingredients>(ingredients);
    }



    public static class BigmacBuilder{
        private Bun bun;
        private Sauce sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun){
            this.bun=bun;
            return this;
        }
        public BigmacBuilder sauce(Sauce sauce){
            this.sauce=sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            if (sauce.equals(null) || bun.equals(null) || ingredients.size()<1){
                throw new IllegalStateException("Illegal composition");
            } else {
                return new Bigmac(bun, sauce, ingredients);
            }

        }

    }

    public Bun getBun() {
        return bun;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
