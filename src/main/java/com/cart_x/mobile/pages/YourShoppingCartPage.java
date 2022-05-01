package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class YourShoppingCartPage extends Utility {
    By verifyTextYourShoppingCart1Item = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By verifySubtotal=By.xpath("//ul[@class='sums']/li/span");
    By verifyExpectedTotal=By.xpath("//li[@class='total']/span/span[1]");
    By clickOnCheckOutButton=By.xpath("//span[contains(text(),'Go to checkout')]");

    By clickOnEmptyYourCartLink = By.xpath("//a[contains(text(),'Empty your cart')]");
    By verifyTextItemsDeletedFromYourCart = By.id("status-messages");
    By verifyTextYourCartIsEmpty = By.xpath("//h1[contains(text(),'Your cart is empty')]");


    public String getTextYourShoppingCart1Item(){
       return getTextFromElement(verifyTextYourShoppingCart1Item);
    }
    public String getSubTotal(){
        return getTextFromElement(verifySubtotal);
    }
    public String getExpectedTotal(){
        return getTextFromElement(verifyExpectedTotal);
    }
    public void setClickOnCheckOutButton(){
        clickOnElement(clickOnCheckOutButton);
    }
    public void setClickOnEmptyYourCartLink(){
        clickOnElement(clickOnEmptyYourCartLink);
    }
    public String getTextItemsDeletedFromYourCart(){
        return getTextFromElement(verifyTextItemsDeletedFromYourCart);
    }
    public String getTextYourCartIsEmpty(){
        return getTextFromElement(verifyTextYourCartIsEmpty);
    }
}
