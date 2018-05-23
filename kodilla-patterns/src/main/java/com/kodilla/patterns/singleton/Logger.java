/*
 * Created by Matt Stefanski on 5/19/18 11:11 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 11:11 AM
 */

package com.kodilla.patterns.singleton;


public class Logger {

    private static Logger logger = null;

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}