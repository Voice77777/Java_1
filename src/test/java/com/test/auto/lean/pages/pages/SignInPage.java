package com.test.auto.lean.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestDataProperties;

public class SignInPage extends BasePage {
    //public WebDriver driver;
    //Conctructor
    public SignInPage(WebDriver driver) {
        super(driver);
        driver.get(TestDataProperties.getTestProperty("td.url"));//??????
    }

    //Write Text
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

   // public search()
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    //Page Variables
    /*public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }*/
}