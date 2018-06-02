/*
 * Created by Matt Stefanski on 5/23/18 10:15 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/23/18 10:15 PM
 */

package com.kodilla.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "mateusz");
        connectionProps.put("password", "kodilla");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ms?serverTimezone=Europe/Warsaw&useSSL=False",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}