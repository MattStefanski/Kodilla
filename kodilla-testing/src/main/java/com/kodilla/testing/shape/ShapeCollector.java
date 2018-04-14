/*
 * Created by Matt Stefanski on 4/14/18 7:29 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/14/18 7:29 PM
 */

package com.kodilla.testing.shape;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;

interface Shape{

   String getShapeName();

   double getFieldSize();

}

class Square implements  Shape{

   public static String name="Square";
   private double dim1;
   private double dim2;


    public Square(double dim1, double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }

    @Override
    public String getShapeName() {
        return name;
    }


    @Override
    public double getFieldSize() {
        return this.dim1*this.dim2;
    }

}


class Circle implements  Shape{

    public static String name="Circle";
    private double r;

    public Circle(double r){
        this.r=r;
    }

    @Override
    public String getShapeName() {
        return name;
    }


    @Override
    public double getFieldSize() {

        return 3.1415*r*r;
    }



}



class Triangle implements  Shape{

    public static String name="Triangle";
    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a=a;
        this.h=h;
    }

    @Override
    public String getShapeName() {
        return name;
    }


    @Override
    public double getFieldSize() {
        return 0.5*a*h;
    }



}
public class ShapeCollector {


        private ArrayList<Shape> shapes;

        public ShapeCollector(ArrayList<Shape> shapes){
            this.shapes=shapes;
        }

        public ArrayList<Shape> getShapes() {
            return shapes;
        }

        void addShape(Shape shape){
            this.shapes.add(shape);
        }

        void rmvShapeByPos(int pos){
            this.shapes.remove(pos);
        }

        void rmvShapesByName(String shapeName){
            this.shapes.removeIf(i->i.getShapeName().equals(shapeName));
        }

        Shape getFigureByPos(int pos){
            return this.shapes.get(pos);

        }




}
