/*
 * Created by Matt Stefanski on 4/18/18 11:39 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/18/18 11:39 PM
 */

package com.kodilla.stream;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PoemBeautifier {





    public static void main(String[] args) {
        PoemDecorator stringBeautifyUpper=(text)-> System.out.println(text.toUpperCase());
        PoemDecorator stringBeautifyAddABC=(text)-> System.out.println("ABC "+text+" ABC");
        PoemDecorator stringBeautifyReverse=(text)-> System.out.println(new StringBuilder(text).reverse().toString());
        PoemDecorator stringBeautifyMakeScrablle=(text)-> {
            String in=text.replaceAll("\\s","");
            List<String>tmp=Arrays.asList(in.split(""));
            Collections.shuffle(tmp);
            String result =String.join(" | ",tmp);
            System.out.println(result);
            } ;
        stringBeautifyUpper.decorate("Lived as a devil");
        stringBeautifyAddABC.decorate("Lived as a devil");
        stringBeautifyReverse.decorate("Lived as a devil");
        stringBeautifyMakeScrablle.decorate("Lived as a devil");
    }
}
