package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckOutPage extends Utility {
    By verifyTheTextSecureCheckOut=By.xpath("//h1[@class='title']");
    By enterFirstname = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastname = By.xpath("//input[@id='shippingaddress-lastname']");
    By enterAddress = By.xpath("//input[@id='shippingaddress-street']");
    By enterState = By.xpath("//input[@id='shippingaddress-custom-state']");
    By checkbox=By.xpath("//input[@id='create_profile']");
    By password1=By.xpath("//input[@id='password']");
    By deliveryMethodLocalShipping = By.xpath("//span[normalize-space()='Local shipping']");
    By selectPaymentMethodCOD = By.xpath("//span[contains(text(),'COD')]");
    By verifyTotal$26cent86 = By.xpath("//div[@class='total clearfix']/span/span");
    By clickOnPlaceOrderButton = By.xpath("//span[contains(text(),'Place order: $26.86')]");
    By verifyTextThankYouForYourOrder = By.id("page-title");

    public String getTextSecureCheckOut(){
        return getTextFromElement(verifyTheTextSecureCheckOut);
    }
    public void enterFirstname(String firstname){
        sendTextToElement(enterFirstname,firstname);
    }
    public void enterLastname(String lastname){
        sendTextToElement(enterLastname,lastname);
    }
    public void enterAddress(String address){
        sendTextToElement(enterAddress,address);
    }
    public void enterState(String state){
        sendTextToElement(enterState,state);
    }
    public void clickOnCheckBoxCreateYourAccountForLaterUse(){
        clickOnElement(checkbox);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void setDeliveryMethodToLocalShipping(){
        clickOnElement(deliveryMethodLocalShipping);
    }
    public void selectPaymentMethodToCOD(){
        clickOnElement(selectPaymentMethodCOD);
    }
    public String getTheTotal(){
        return getTextFromElement(verifyTotal$26cent86);
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(clickOnPlaceOrderButton);
    }
    public String getTextThankYouForYourOrder(){
        return getTextFromElement(verifyTextThankYouForYourOrder);
    }

}
