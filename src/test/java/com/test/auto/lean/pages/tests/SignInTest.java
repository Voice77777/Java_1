package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TestDataProperties;


class SignInTest {
    public WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void goSignIn() throws InterruptedException {
        driver.get(TestDataProperties.getTestProperty("td.url"));//("https://leantesting.com");
        BasePage basePage = new BasePage(driver);
        basePage.click(Locators.get("lc.GoSignInPage"));
        basePage.writeText(Locators.get("lc.fieldInputName"), TestDataProperties.getTestProperty("td.username"));
        basePage.writeText(Locators.get("lc.fieldInputPass"), TestDataProperties.getTestProperty("td.password"));
        Thread.sleep(5000);
        basePage.click(Locators.get("lc.buttonSignIn"));
        Thread.sleep(5000);
        basePage.click(Locators.get("lc.linkSignOut"));
        }

    @AfterTest
    void tearDown(){
      if (driver != null){
        driver.quit();
        }
    }
}
