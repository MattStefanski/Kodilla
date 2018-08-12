/*
 * Created by Matt Stefanski on 8/11/18 1:17 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/11/18 1:17 AM
 */

package com.kodilla.testing2.ebay;

import com.kodilla.testing2.ebay.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class EBayTestingApp {


    public static void main(String[] args) {


        WebDriver webDriver=new SafariDriver();
        webDriver.get("https://www.ebay.pl");
        WebElement searchField =webDriver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchField.sendKeys("Laptop");
        searchField.submit();

    }



}
