/*
 * Created by Matt Stefanski on 8/11/18 1:21 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/11/18 1:21 AM
 */

package com.kodilla.testing2.ebay.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverConfig {

    public final static String CHROME="CHROME_DRIVER";

   public static WebDriver getDriver(final String drive){
       System.setProperty("webdriver.chrome.driver","/Users/mateusz/Downloads/chromedriver-3");

   if(drive.equals(CHROME)){
       return new ChromeDriver();
   } else
       return null;
   }

}
