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

public class InvalidLogInTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void notLogged() throws InterruptedException {
        driver.get(TestDataProperties.getTestProperty("td.MainPageUrlW"));
        BasePage basePage = new BasePage(driver);
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.goLogInW"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleLogInW"));
        basePage.writeText(Locators.get("lc.usernameLogFieldW"), TestDataProperties.getTestProperty("td.empty"));
        basePage.writeText(Locators.get("lc.userpassLogFieldW"), TestDataProperties.getTestProperty("td.userPassW"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.logInButtonW"));
        Thread.sleep(1000);
        Assert.assertEquals(basePage.readText(Locators.get("lc.notLoggedLinkW")), TestDataProperties.getTestProperty("td.notLoggedLinkTextW"));
    }

    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
