package com.saucelabs.pages;

import com.saucelabs.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.saucelabs.base.BasePage.driver;
public class CartPage {

    @FindBy(linkText = "CHECKOUT")
    private static WebElement checkout;

    public CartPage(){
        PageFactory.initElements(driver,this);
    }

    public static void clickCheckout(){
        HelperMethods.doClick(checkout);
    }

}
