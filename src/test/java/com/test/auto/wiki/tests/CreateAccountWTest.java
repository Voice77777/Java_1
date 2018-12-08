package com.test.auto.wiki.tests;

import com.test.auto.lean.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TestDataProperties;

public class CreateAccountWTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void goCreateAccountW() throws InterruptedException { driver.get(TestDataProperties.getTestProperty("td.MainPageUrlW"));
        BasePage basePage = new BasePage(driver);
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.goCreateAccountW"));
        //Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleCreateAccountW"));
        basePage.writeText(Locators.get(""), TestDataProperties.getTestProperty(""));
    }

    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
