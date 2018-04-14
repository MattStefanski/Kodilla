

package com.kodilla.testing.collection;


import org.junit.*;
import com.google.common.collect.Lists;
import org.junit.rules.TestName;
import com.kodilla.testing.collection.OddNumbersExterminator.*;

import java.util.ArrayList;

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

           ArrayList<Integer> nullArray=null;
           ArrayList<Integer>testingArray=new OddNumbersExterminator().exterminate(Lists.newArrayList());
           Assert.assertEquals(testingArray,nullArray);

    }
    @Test
        public void testRemovingOdds(){

            ArrayList<Integer> givenArray=Lists.newArrayList(2,3,4,1,2);
            ArrayList<Integer>testingArray=new OddNumbersExterminator().exterminate(Lists.newArrayList(2,3,4,1,2));
            if(testingArray.size()>1) {
                boolean oddExists = false;
                boolean eventExists = false;
                for (int a=0; a<testingArray.size();a++){
                if(testingArray.get(a)%2==0){
                    oddExists=true;

                }else{
                    eventExists=true;
                }
                }
                if(oddExists & eventExists){
                   Assert.assertNotEquals(testingArray,givenArray);
                }
            }
    }



}
