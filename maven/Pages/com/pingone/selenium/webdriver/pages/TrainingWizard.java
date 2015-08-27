/******************************************************
 * Copyright (C) 2005 Ping Identity Corporation
 * All rights reserved.
 *
 * The contents of this file are the property of Ping Identity Corporation.
 * You may not copy or use this file, in either source code or executable
 * form, except in compliance with terms set by Ping Identity Corporation.
 * For further information please contact:
 *
 *      Ping Identity Corporation
 *      1099 18th St Suite 2950
 *      Denver, CO 80202
 *      303.468.2900
 *      http://www.pingidentity.com
 *
 *******************************************************/

package com.pingone.selenium.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class TrainingWizard
{
    WebDriver driver = new FirefoxDriver();
    
    private String appTrainningCloseBtn = "pistachio-overlay-window-close";
    private String appTrainningStepTxt = "pistachio-overlay-text";
    private String appTrainningButton1 = "pistachio-overlay-button1";
    
    public void openURL(String url)
    {
        driver.get(url);
    }
    
    public void assertContains(String expStr)
    {
        String text = driver.findElement(By.id(appTrainningStepTxt)).getText();
        Assert.assertTrue(text.contains(expStr));
    }
    
    public void clickBtn()
    {
        driver.findElement(By.id(appTrainningButton1)).click();
    }
    
}
