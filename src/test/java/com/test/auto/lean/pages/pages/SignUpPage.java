package com.test.auto.lean.pages.pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

import static utils.TestDataProperties.getTestProperty;

public class SignUpPage extends BasePage{
    //private WebDriver driver;

    //Constructor
    public SignUpPage(WebDriver driver) {
        super(driver);
        driver.get(getTestProperty("td.url"));
    }

    public void goSignUp(){
        click(Locators.get("lc.GoSignUpPage"));
        writeText(Locators.get("lc.userMailInput"), getTestProperty("td.email"));
        writeText(Locators.get("lc.userNameInput"), getTestProperty("td.login"));
        writeText(Locators.get("lc.userPassInput"), getTestProperty("td.password"));
        click(Locators.get("lc.loginButton"));
        System.out.println("Sign Up done");
    }
}
