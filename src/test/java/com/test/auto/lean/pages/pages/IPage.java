package com.test.auto.lean.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface IPage {
    //void BasePage(WebDriver driver);
    void waitVisibility(By elementBy);
    void click(By elementBy);
    void writeText(By elementBy, String text);
    String readText(By elementBy);
    void assertEquals(By elementBy, String expectedText);
    void verifyText(String expectedText, By elementBy);
}
