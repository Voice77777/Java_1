package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.SignInPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.Locators;
import utils.TestDataProperties;

import static utils.TestDataProperties.getTestProperty;

public class SignInPageTest extends BaseTest{
    //public WebDriver driver;

    @Test
    void goSignInTest(){
        SignInPage signInPage = new SignInPage(driver);
        super.initAll();
        super.setupTest();
        driver.get(TestDataProperties.getTestProperty("td.url"));
        super.tearDown();
        //signInPage.goSignIn(Locators.get("lc.GoSignInPage"));

        }
    }
/*      signInPage.writeText(Locators.get("lc.userNameInput"), TestDataProperties.getTestProperty("td.login"));
        signInPage.writeText(Locators.get("lc.userPassInput"), TestDataProperties.getTestProperty("td.password"));
        signInPage.click(Locators.get("lc.loginButton"));
        System.out.println("Sign In done");*/