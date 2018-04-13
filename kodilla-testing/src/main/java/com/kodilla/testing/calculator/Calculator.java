package com.kodilla.testing.calculator;

import java.util.Scanner;
public class Calculator {

    Scanner sc=new Scanner(System.in);


    String[] inputEquation(){
        String equation;
        System.out.println("Insert equation\n " +
                "available operations:\n" +
                "   +  (adding)" +
                "   -  (substracting)");
        equation=  sc.nextLine();
        equation.replaceAll("\\s+","");
        String[] eq= equation.split("");
        return eq;
    }

    double operationProcessing(String[] equation){
        int c=0;
        double result = 0.00;

        for(String i :equation){

            if(i.equals('+')){
               result=add(Double.parseDouble(equation[c-1]), Double.parseDouble(equation[c+1]))
                c+=1;
              
            }
        }
        return result;

    }

    double add(double x, double y){
        return x+y;
    }

    double substract(double x, double y){
        return x-y;
    }




}
