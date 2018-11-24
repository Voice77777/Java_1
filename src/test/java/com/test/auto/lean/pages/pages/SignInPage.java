package com.test.auto.lean.pages.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;
import utils.TestDataProperties;

import static utils.TestDataProperties.getTestProperty;

public class SignInPage extends BasePage {
    //protected WebDriver driver;
    //protected WebDriverWait wait;


    //Conctructor
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    //public

    public void signInPageGo(){
        click(Locators.get("lc.GoSignInPage"));
        writeText(Locators.get("lc.userNameInput"), getTestProperty("td.login"));
        writeText(Locators.get("lc.userPassInput"), getTestProperty("td.password"));
        click(Locators.get("lc.loginButton"));
        System.out.println("Sign In done");
    }
}