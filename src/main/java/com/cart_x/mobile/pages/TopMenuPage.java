package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By shippingWelcomeText = By.xpath("//h1[@id='page-title']");
    By newWelcomeText = By.xpath("//h1[@id='page-title']");
    By comingSoonWelcomeText = By.xpath("//h1[@id='page-title']");
    By contactUsWelcomeText = By.xpath("//h1[@id='page-title']");

    public String getShippingWelcomeText(){
        return getTextFromElement(shippingWelcomeText);
    }
    public String getnewWelcomeText(){
        return getTextFromElement(newWelcomeText);
    }
    public String getComingSoonWelcomeText(){
        return getTextFromElement(comingSoonWelcomeText);
    }
    public String getContactUsWelcomeText(){
        return getTextFromElement(contactUsWelcomeText);
    }

}
