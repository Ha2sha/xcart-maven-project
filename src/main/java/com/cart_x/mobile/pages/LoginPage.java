package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By verifyTheTextLoginToYourAccount=By.xpath("//h3[contains(text(),'Log in to your account')]");
    By email=By.xpath("//input[@id='email']");
    By continueButton=By.xpath("//span[contains(text(),'Continue')]");

    public String getTheTextLoginToYourAccount(){
        return getTextFromElement(verifyTheTextLoginToYourAccount);
    }
    public void enterEmailAddress(String emailaddress){
        sendTextToElement(email, emailaddress);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
