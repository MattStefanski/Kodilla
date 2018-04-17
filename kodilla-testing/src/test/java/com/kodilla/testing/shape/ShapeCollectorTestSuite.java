/*
 * Created by Matt Stefanski on 4/14/18 9:57 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/14/18 9:57 PM
 */

package com.kodilla.testing.shape;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
import org.junit.*;
import org.junit.rules.TestName;

public class ShapeCollectorTestSuite {


    @Rule public TestName name=new TestName();

    @Before
    public void before(){
        System.out.println("Starting test: "+name.getMethodName());
    }

    @After
    public void after(){
        System.out.println("OK: Executed test: "+name.getMethodName());
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test proceeding");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("OK: Tests has been executed");
    }


    @Test
    public void testAddingShape(){


        ShapeCollector testedCollector=new ShapeCollector(Lists.newArrayList(new Circle(2),new Circle(2),new Square(3,4),new Square(3,4)));

        assertEquals(4,testedCollector.getShapes().size());

        testedCollector.addShape(new Triangle(2,4));

        assertEquals("Triangle",testedCollector.getShapes().get(4).getShapeName());
        assertEquals(5,testedCollector.getShapes().size());


    }

    @Test
    public void testRmvByName(){
        ShapeCollector testedCollector=new ShapeCollector(Lists.newArrayList(new Circle(2),new Circle(2),new Square(3,4),new Square(3,4),new Triangle(3,4)));
        testedCollector.rmvShapesByName("Square");
        for (Shape shape:testedCollector.getShapes()){
            assertFalse(shape.getShapeName().equals("Square"));

        }


    }


    @Test
    public void testRmvByPos(){
        int givenPos=4;
        ShapeCollector testedCollector=new ShapeCollector(Lists.newArrayList(new Circle(2),new Circle(2),new Square(3,4),new Square(3,4),new Triangle(3,4)));

        assertEquals(5,testedCollector.getShapes().size());
        testedCollector.rmvShapeByPos(givenPos);
        assertEquals(4,testedCollector.getShapes().size());
        for (Shape shape:testedCollector.getShapes()){
            assertFalse(shape.getShapeName().equals("Triangle"));

        }

    }

    @Test
    public void testGetFigureByPos(){
        ShapeCollector testedCollector=new ShapeCollector(Lists.newArrayList(new Circle(2),new Circle(2),new Square(3,4),new Triangle(3,4)));
        assertEquals("Square",testedCollector.getShapes().get(2).getShapeName());

    }

    @Test
    public void testFieldCalculation(){

       //Square testing
        int givenPos=2;
        double givenField=12;
        ShapeCollector testedCollector=new ShapeCollector(Lists.newArrayList(new Circle(2),new Circle(2),new Square(3,4),new Triangle(3,4)));
        assertEquals(givenField,testedCollector.getFigureByPos(givenPos).getFieldSize(),0);
       //Triangle testing
        givenPos=3;
        givenField=6;
        assertEquals(givenField,testedCollector.getFigureByPos(givenPos).getFieldSize(),0);



    }





}
