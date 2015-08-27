package com.pingone.selenium.webdriver.testcases;

import org.testng.annotations.Test;

import com.pingone.selenium.webdriver.pages.TrainingWizard;

public class TestCase1
{
    @Test
    public void testTrainingApp() throws Exception
    {
        TrainingWizard wizard = new TrainingWizard();
        wizard.assertContains("Step 1");
        wizard.openURL("www.facebook.com");
        wizard.assertContains("Step 2");
        wizard.clickBtn();
    }
    
}
