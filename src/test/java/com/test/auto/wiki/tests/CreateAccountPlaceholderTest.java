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

public class CreateAccountPlaceholderTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void placeholderCreateAccountW() throws InterruptedException { driver.get(TestDataProperties.getTestProperty("td.MainPageUrlW"));
        BasePage basePage = new BasePage(driver);
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.goCreateAccountW"));
        Assert.assertEquals(driver.getTitle(), Locators.title("lc.titleCreateAccountW"));
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.usernameCreateFildW")),
                TestDataProperties.getTestProperty("td.userNamePlaceholderW"));
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.userpassCreateFieldW")),
                TestDataProperties.getTestProperty("td.userPassPlaceholderW"));
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.userpassConfirmCreateFieldW")),
                TestDataProperties.getTestProperty("td.userPassConfirmPlaceholderW"));
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.userMailCreateFieldW")),
                TestDataProperties.getTestProperty("td.userMailPlaceholderW"));
    }

    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
