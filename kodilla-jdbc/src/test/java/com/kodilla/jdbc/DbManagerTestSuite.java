/*
 * Created by Matt Stefanski on 5/23/18 10:29 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/23/18 10:28 PM
 */

package com.kodilla.jdbc;import org.junit.Test;

import java.sql.SQLException;
import org.junit.Assert;
import java.sql.Statement;
import java.sql.ResultSet;
public class DbManagerTestSuite {


    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "select u.NAME,u.SURNAME from POSTS LEFT JOIN USERS U ON POSTS.FK_USER_ID = U.ID GROUP BY u.NAME,u.SURNAME HAVING COUNT(u.SURNAME) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("NAME") + ", " +
                    rs.getString("SURNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}


