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

public class WikiversityTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void linkWikiversity(){
        driver.get(TestDataProperties.getTestProperty("td.StartPageWUrl"));
        BasePage basePage = new BasePage(driver);
        basePage.click(Locators.get("lc.linkWikiversity"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.WikiversityTitle"));
        System.out.println("Test end OK!");
    }


    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
