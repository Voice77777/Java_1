package com.test.auto.lean.pages.tests;

import com.test.auto.lean.pages.pages.SignInPage;
import org.testng.annotations.Test;
import utils.TestDataProperties;

public class SignInPageTest extends BaseTest {
    //protected WebDriver driver;
    SignInPage signInPage = new SignInPage(driver);

    @Test
    void goSignInTest(){
        driver.get(TestDataProperties.getTestProperty("td.url"));
        signInPage.submitButton();
        signInPage.userNameInput();
        signInPage.userPassInput();
        super.tearDown();
        }
    }
/*      signInPage.writeText(Locators.get("lc.userNameInput"), TestDataProperties.getTestProperty("td.login"));
        signInPage.writeText(Locators.get("lc.userPassInput"), TestDataProperties.getTestProperty("td.password"));
        signInPage.click(Locators.get("lc.loginButton"));
        System.out.println("Sign In done");*/
}