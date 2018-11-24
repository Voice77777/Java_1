package com.test.auto.lean.pages.pages;

import org.openqa.selenium.By;

public interface IPage {
    void waitVisibility(By elementBy);
    void click(By elementBy);
    void writeText(By elementBy, String text);
    String readText(By elementBy);
}
