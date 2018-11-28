package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TestDataProperties;


class BaseTest {
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
        basePage.click(Locators.get("lc.SignIn"));
        basePage.writeText(Locators.get("lc.userNameInput"), TestDataProperties.getTestProperty("td.username"));
        basePage.writeText(Locators.get("lc.userPassInput"), TestDataProperties.getTestProperty("td.password"));
        Thread.sleep(5000);
        basePage.click(Locators.get("lc.loginButton"));
        Thread.sleep(5000);
        basePage.click(Locators.get("lc.SignOutLink"));
        }

    @AfterTest
    void tearDown(){
      if (driver != null){
        driver.quit();
        }
    }
}
