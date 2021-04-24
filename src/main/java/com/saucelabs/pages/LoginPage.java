package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.saucelabs.base.BasePage.driver;

public class LoginPage {

    // locators using FindBy

    @FindBy(id = "user-name")
    private static WebElement userName;


    @FindBy(id = "password")
    private static WebElement password;

    @FindBy(xpath = "//input [@id='login-button']")
    private static WebElement loginBtn;

    @FindBy(xpath = "//h3 [@data-test='error']")
    private static WebElement errorMsg;

    // Constructor
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }
    // Page Actions
    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void enterUserName(String user){

        HelperMethods.sendText(userName, user);
    }
    public static void enterPassword(String pass){

        HelperMethods.sendText(password, pass);
    }

    public static void clickOnLoginBtn(){

        HelperMethods.doClick(loginBtn);
    }

    public static String invalidLoginMsg(){

        return HelperMethods.doGetText(errorMsg);
    }
}
