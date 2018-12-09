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

public class SearchFieldWTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void searchField() throws InterruptedException {
        driver.get(TestDataProperties.getTestProperty("td.MainPageUrlW"));
        BasePage basePage = new BasePage(driver);
        basePage.writeText(Locators.get("lc.searchFieldMainPageW"), TestDataProperties.getTestProperty("td.searchFieldMainPageW"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.searchButtonW"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleSearchingJavaPage"));
        driver.navigate().back();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleMainPage"));
    }


    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }



}
