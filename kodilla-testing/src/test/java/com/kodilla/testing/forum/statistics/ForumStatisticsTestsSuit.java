/*
 * Created by Matt Stefanski on 4/15/18 5:54 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/15/18 5:54 PM
 */

package com.kodilla.testing.forum.statistics;
import com.google.common.collect.Lists;

import org.junit.*;
import org.junit.rules.TestName;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;





public class ForumStatisticsTestsSuit {


    @Rule
    public TestName name=new TestName();

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
    public void testsStatisticsCalculator(){
        Statistics statisticsMock= mock(Statistics.class);
        List<String> usLs1=Lists.newArrayList();
        List<String> usLs2=Lists.newArrayList();
        for (int i=0;i<100;i++){
            usLs2.add("User"+i);
        }
        int postsCount1=0;
        int postsCount2=1000;
        int commentsCount1=0;
        int commentsCount2=100;




        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);
        when(statisticsMock.usersNames()).thenReturn(usLs1);
        StatisticsCalculator sc=new StatisticsCalculator();
        sc.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0,sc.avgCommentsPerPosts,0);



        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);
        when(statisticsMock.usersNames()).thenReturn(usLs2);
        sc=new StatisticsCalculator();
        sc.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(1,sc.avgCommentsPerUser,0);


        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);
        when(statisticsMock.usersNames()).thenReturn(usLs2);
        sc=new StatisticsCalculator();
        sc.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0.1,sc.avgCommentsPerPosts,0);


        when(statisticsMock.postsCount()).thenReturn(postsCount2);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount2);
        when(statisticsMock.usersNames()).thenReturn(usLs2);
        sc=new StatisticsCalculator();
        sc.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(10,sc.avgPostsPerUser,0);



    }




}
