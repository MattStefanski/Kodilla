package com.kodilla.testing.collection;

import org.junit.*;
import com.google.common.collect.Lists;
import org.junit.rules.TestName;
import com.kodilla.testing.collection.OddNumbersExterminator.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Rule public TestName name=new TestName();

    @Before
         public void before(){
           System.out.println("Starting test: "+name.getMethodName());
          }

    @After
         public void after(){
           System.out.println("Executed test: "+name.getMethodName());
          }
    @Test
         public void testNullArrayList(){

           List<Integer> nullArray=new ArrayList<>();
           List<Integer>testingArray=new OddNumbersExterminator().exterminate(Lists.newArrayList());
           Assert.assertEquals(testingArray,nullArray);

    }
    @Test
        public void testRemovingOdds(){
        //Given
        ArrayList<Integer> givenArray = Lists.newArrayList(2, 3, 4, 1, 2);

        //When
        List<Integer> testingArray = new OddNumbersExterminator().exterminate(Lists.newArrayList(2, 3, 4, 1, 2));

        //Then
        for(Integer integer : testingArray){
            Assert.assertTrue(integer % 2 == 0);
        }

    }



}
