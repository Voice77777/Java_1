package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
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
    public void goSignUp(){
        driver.get(TestDataProperties.getTestProperty("td.url"));//("https://leantesting.com");
        BasePage basePage = new BasePage(driver);
        basePage.click(By.id("menu-item-36"));
        basePage.writeText(By.id("username"), TestDataProperties.getTestProperty("td.username"));
        basePage.writeText(By.id("password"), TestDataProperties.getTestProperty("td.password"));
        basePage.click(By.cssSelector("#button.btn.btn-form"));
        }

    @AfterTest
    void tearDown(){
      /*if (driver != null){
        driver.quit();
        }*/
    }
}
