/*
 * Created by Matt Stefanski on 8/3/18 9:50 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/3/18 9:50 PM
 */

package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager=DbManager.getInstance();
        String executeUpdate = "Call UpdateBestsellers()";
        Statement statement=dbManager.getConnection().createStatement();
        statement.execute(executeUpdate);

        //When

        ResultSet result=statement.executeQuery("Select sum(Bestseler) as n_bestselers from books");

        int howMany=-1;

        if(result.next()) {
            howMany = result.getInt("n_bestselers");
        }
        Assert.assertEquals(1,howMany);
    }


}
