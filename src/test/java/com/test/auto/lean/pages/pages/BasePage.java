package com.test.auto.lean.pages.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestDataProperties;

public class BasePage implements IPage{
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        //driver.findElement()
    }

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
    public void assertEquals(By elementBy, String expectedText){//TestNG!!!!!!expected, actual
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }
    //Verify
    public void verifyText(String expectedText, By elementBy){
        waitVisibility(elementBy);
        Assert.assertEquals(expectedText, readText(elementBy));
    }
}
