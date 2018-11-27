package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.Locators;
import utils.TestDataProperties;

import static org.junit.jupiter.api.Assertions.fail;

class BaseTest {
    protected WebDriver driver;


    @BeforeClass
    public static void setupClass(){
        WebDriverManager.firefoxdriver().setup();
    }


    @BeforeTest
    public void setupTest(){
        driver = new FirefoxDriver();
    }

/*    @Test
    void succeedingTest(){
        SignInPage signInPage = new SignInPage(driver);
        //driver.get(TestDataProperties.getTestProperty("td.url"));//("https://leantesting.com");
        signInPage.getUrl("https://leantesting.com");
        signInPage.userNameInput();
        signInPage.userPassInput();
    }*/

    @AfterTest
    void tearDown(){
      /*if (driver != null){
        driver.quit();
        }*/
    }
}
