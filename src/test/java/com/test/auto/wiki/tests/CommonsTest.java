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

public class CommonsTest {
        private WebDriver driver;

        @BeforeTest
        public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        }
        @Test
        public void linkCommons(){ driver.get(TestDataProperties.getTestProperty("td.StartPageWUrl"));
        BasePage basePage = new BasePage(driver);
        basePage.click(Locators.get("lc.linkCommons"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.CommonsTitle"));
        }
        @AfterTest
        void tearDown(){
            if (driver != null){
                driver.quit();
            }
        }

}
