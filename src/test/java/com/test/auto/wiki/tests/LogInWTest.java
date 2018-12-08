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

public class LogInWTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void goLogIn() throws InterruptedException { driver.get(TestDataProperties.getTestProperty("td.MainPageUrlW"));
        BasePage basePage = new BasePage(driver);
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.goLogInW"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleLogInW"));
        basePage.writeText(Locators.get("lc.usernameLogFieldW"), TestDataProperties.getTestProperty("td.userNameW"));
        basePage.writeText(Locators.get("lc.userpassLogFieldW"), TestDataProperties.getTestProperty("td.userPassW"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.logInButtonW"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.userLink"));
        Assert.assertEquals(driver.getTitle(), TestDataProperties.getTestProperty("td.userPageTitle"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.goLogOut"));

        //Assert.assertEquals(driver.getTitle(), Locators.title(""));
    }

    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
