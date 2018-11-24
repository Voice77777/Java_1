package com.test.auto.lean.pages.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BaseTest {
    WebDriver driver;

    @BeforeAll
    static void initAll(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setupTest(){
        driver = new FirefoxDriver();
    }

    @AfterEach
    void tearDown(){
        if (driver != null){
        driver.quit();
        }
    }

    @AfterAll
    static void tearDownAll(){

    }
}
