package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.SignInPage;
import org.junit.jupiter.api.Test;
import utils.Locators;
import utils.TestDataProperties;

import static utils.TestDataProperties.getTestProperty;

public class SignInPageTest extends BaseTest{
    @Test
    void goSignInTest(){
        //Instance
        SignInPage signInPage = new SignInPage(driver);
        driver.get(TestDataProperties.getTestProperty("td.url"));
        signInPage.click(Locators.get("lc.GoSignInPage"));
        signInPage.writeText(Locators.get("lc.userNameInput"), getTestProperty("td.login"));
        signInPage.writeText(Locators.get("lc.userPassInput"), getTestProperty("td.password"));
        signInPage.click(Locators.get("lc.loginButton"));
        System.out.println("Sign In done");
        }
        }
