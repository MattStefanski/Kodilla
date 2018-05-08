/*
 * Created by Matt Stefanski on 5/3/18 11:47 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/3/18 11:47 PM
 */

package com.kodilla.good.patterns.challenges;
import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


    public static void main(String[] args) {
        MovieStore ms=new MovieStore();

        System.out.println(ms.getMovies()
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!")));



    }

}
