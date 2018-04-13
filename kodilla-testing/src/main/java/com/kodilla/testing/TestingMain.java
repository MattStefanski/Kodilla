package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        Calculator calc=new Calculator();


        if (calc.add(1,2.21)==3.21){
            System.out.println("Adding ok");
        } else {
            System.out.println("Adding Error!");
        }




        if (calc.substract(2.21,1.00)==1.21){
            System.out.println("Substracting ok");
        } else {
            System.out.println("Substracting Error!");
        }
    }
}
