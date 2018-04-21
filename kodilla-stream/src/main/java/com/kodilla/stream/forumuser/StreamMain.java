/*
 * Created by Matt Stefanski on 4/20/18 11:15 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 4/20/18 11:15 PM
 */

package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
public class StreamMain {
    public static void main(String[] args) {
        Forum forum=new Forum();
        Map<Integer, ForumUser> theResultMapOfBooks= forum.getUserList()
                .stream()
                .filter(u->u.getAge()>=20)
                .filter(u->u.getSex()=='M')
                .filter(u->u.getPostsNumber()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, u->u));

        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " +"{sex: "+ entry.getValue().getSex()+", age: "+entry.getValue().getAge()+", posts number: "+entry.getValue().getPostsNumber()+"} ")
                .forEach(System.out::println);

    }

}
