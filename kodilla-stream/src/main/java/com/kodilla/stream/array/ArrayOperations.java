/*
 * Created by Matt Stefanski on 4/23/18 10:48 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/23/18 10:48 PM
 */

package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double results = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
        System.out.println(results);

        return results;

    }

}
