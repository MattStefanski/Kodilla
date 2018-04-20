/*
 * Created by Matt Stefanski on 4/15/18 6:35 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/15/18 6:27 PM
 */

package com.kodilla.testing.forum.statistics;


public class StatisticsCalculator{

    public double usersNumber=0;
    public double postsCount=0;
    public double commentsCount=0;
    public double avgPostsPerUser=0;
    public double avgCommentsPerUser=0;
    public double avgCommentsPerPosts=0;
   void calculateAdvStatistics(Statistics statistics){
    this.usersNumber = (double) statistics.usersNames().size();
    this.postsCount =(double)  statistics.postsCount();
    this.commentsCount = (double)  statistics.commentsCount();
    this.avgPostsPerUser = (double)  statistics.postsCount() / statistics.usersNames().size();
    this.avgCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
    this.avgCommentsPerPosts = (double) statistics.commentsCount() / statistics.postsCount();
    }




    void showStatistics(){
        System.out.println("Number of users: "+this.usersNumber);
        System.out.println("Number of posts: "+this.postsCount);
        System.out.println("Number of comments: "+this.commentsCount);
        System.out.println("Average number of posts per user: "+this.avgPostsPerUser);
        System.out.println("Average number of comments per user: "+this.avgCommentsPerUser);
        System.out.println("Average number of comments per post: "+this.avgCommentsPerPosts);
    }



}