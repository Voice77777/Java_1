package com.test.auto.lean.pages.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;
import utils.TestDataProperties;

import static utils.TestDataProperties.getTestProperty;

public class SignInPage extends BasePage {

    //Conctructor
    public SignInPage(WebDriver driver) {
        super(driver);
        }

    public void goSignIn(){
        super.click(Locators.get("lc.GoSignInPage"));
    }

    public void userNameInput() {
        super.writeText(Locators.get("lc.userNameInput"), getTestProperty("td.login"));
    }

    public void userPassInput() {
        super.writeText(Locators.get("lc.userPassInput"), getTestProperty("td.password"));
    }

    public void submitButton(){
        super.click(Locators.get("lc.GoSignInPage"));
    }
}