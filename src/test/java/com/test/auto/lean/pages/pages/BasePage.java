package com.test.auto.lean.pages.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage{
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }
    //WebDriverManager.firefoxdriver().setup();
    //Wait Wrapper Method
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        //driver.findElement()
    }
    //Search Elements on the page
    /*public void searchElements(By elementBy){
        waitVisibility();
    }*/
    //Click Method
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    //Write Text
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    //Read Text
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    //Assert
    public void assertEquals(By elementBy, String expextedText){
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expextedText);
    }
}
