package com.kodilla.testing.collection;
import java.util.*;
import com.google.common.collect.*;
public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> number) {

        List<Integer> result = Lists.newArrayList();

        for (Integer integer : number) {
            if (integer % 2 == 0) {
                result.add(integer);
            }
        }
        return result;

    }



}
