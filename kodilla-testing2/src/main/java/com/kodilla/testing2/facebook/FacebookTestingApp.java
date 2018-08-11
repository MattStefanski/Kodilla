/*
 * Created by Matt Stefanski on 8/11/18 10:00 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/11/18 10:00 AM
 */

package com.kodilla.testing2.facebook;

import com.kodilla.testing2.ebay.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {


    public static final String LANDING_PAGE = "https://facebook.com/";
    public static final String REG_FORM="//form[@id=\"reg\"]";
    public static final String MONTH_XPATH=String.format("%1$s//select[@id=\"month\"]",REG_FORM);
    public static final String DAY_XPATH=String.format("%1$s//select[@id=\"day\"]",REG_FORM);
    public static final String YEAR_XPATH=String.format("%1$s//select[@id=\"year\"]",REG_FORM);


    public static void main(String[] args) {

        WebDriver webDriver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get(LANDING_PAGE);

        String day= "24", month = "5", year = "1994";
        Select selectBirthDay = new Select(webDriver.findElement(By.xpath(DAY_XPATH)));
        selectBirthDay.selectByValue(day);
        Select selectBirthMonth = new Select(webDriver.findElement(By.xpath(MONTH_XPATH)));
        selectBirthMonth.selectByValue(month);
        Select selectBirthYear = new Select(webDriver.findElement(By.xpath(YEAR_XPATH)));
        selectBirthYear.selectByValue(year);

    }
}
