package com.saucelabs.base;

import com.saucelabs.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static ItemPage itemPage;
    public static CartPage cartPage;
    public static CheckoutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;

    public static void initialize() {
        // initialize pages
        loginPage = new LoginPage();
        homePage = new HomePage();
        itemPage = new ItemPage();
        cartPage = new CartPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();


    }

}
