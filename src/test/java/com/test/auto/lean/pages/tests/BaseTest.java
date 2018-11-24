package com.test.auto.lean.pages.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;
    //public WebDriverWait wait;

    @BeforeClass
    public static void setupClass(){
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setupTest(){
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        if (driver != null){
        driver.quit();
        }
    }
}
