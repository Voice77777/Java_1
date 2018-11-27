package com.test.auto.lean.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IPage {
    void waitVisibility(By elementBy);
    void click(By elementBy);
    void writeText(By elementBy, String text);
    String readText(By elementBy);
}
