package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By hotDealLink=By.cssSelector("ul[class='nav navbar-nav top-main-menu'] span[class='primary-title']");
    By bestSellersLik=By.linkText("Bestsellers");
    By saleLink=By.linkText("Sale");
    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Shipping')]");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Coming soon')]");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'Contact us')]");

    public void clickOnHotDealLink() {
        clickOnElement(hotDealLink);
    }

    public void clickOnBestSellersLink() {
        clickOnElement(bestSellersLik);
    }

    public void clickSaleLink() {
        clickOnElement(saleLink);
    }
    public void clickOnShippingLink() {
        clickOnElement(shippingLink);
    }

    public void clickOnNewLink() {
        clickOnElement(newLink);
    }

    public void clickOnComingSoonLink() {
        clickOnElement(comingSoonLink);
    }

    public void clickOnContactUsLink() {
        clickOnElement(contactUsLink);
    }


}
