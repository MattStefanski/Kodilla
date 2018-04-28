/*
 * Created by Matt Stefanski on 4/28/18 2:31 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/28/18 2:31 PM
 */

package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

       try{
           System.out.println(firstChallenge.divide(3, 0));

       }catch(ArithmeticException e){

           System.out.println("Division by zero is undefined");
        }finally {

           System.out.println("Calculator has stoped");
       }



    }
}