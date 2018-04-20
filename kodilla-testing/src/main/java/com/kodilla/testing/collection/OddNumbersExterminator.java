package com.kodilla.testing.collection;
import java.util.*;
import com.google.common.collect.*;
public class OddNumbersExterminator {

    ArrayList<Integer>  exterminate(ArrayList<Integer> numbers){
     ArrayList<Integer> arr=numbers;
     ArrayList<Integer> arr2=Lists.newArrayList();
    if (arr.size()==0){
        arr=null;
    }else {

        for (int i = 0; i < arr.size(); i++) {

            if ((arr.get(i) % 2) == 0) {
                if (!arr2.contains(arr.get(i))) {

                    arr2.add(arr.get(i));
                }
            }

        }


        for (int i = 0; i < arr2.size(); i++) {
            while (arr.remove(arr2.get(i))) {
            }
        }
    }
     return arr;

    }



}
