package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TestDataProperties;

public class InAppBugReportingTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void linkInAppBugReporting(){
        driver.get(TestDataProperties.getTestProperty("td.HomePageUrl"));//("https://leantesting.com");
        BasePage basePage = new BasePage(driver);
        basePage.click(Locators.get("lc.linkInAppBugReporting"));
        String titleActual = driver.getTitle();
        String titleExpected = Locators.title("lc.InAppBugReportingTitle");
        Assert.assertEquals(titleActual, titleExpected);
    }


    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
