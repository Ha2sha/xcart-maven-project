package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BestSellersPage extends Utility {
    By bestSellerWelcomeText = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectNameAtoZ = By.linkText("Name A - Z");
    By selectNameZtoA = By.linkText("Name Z - A");
    By priceLowToHigh = By.linkText("Price High - Low");
    By sortingByRates = By.linkText("Rates");
    By verifyProductsSortedByRates = By.xpath("//div[@class='stars-row full']");
    By clickAddToCartVinylIdolzGhostbusters = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']"); //button[@class='btn  regular-button add-to-cart product-add2cart productid-13']
    By verifyMsgProductAddedToCart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeTheMessageProductAddedToCart = By.xpath("//div[@id='status-messages']/a");
    By clickYourCartIcon = By.xpath("//div[@title='Your cart']");
    By clickOnViewCartButton = By.xpath("//span[contains(text(),'View cart')]");
    By sortedZtoA = By.xpath("//ul[@class='products-grid grid-list']");
    By priceHighToLow=By.xpath("//div[@class='items-list items-list-products sale-products']//span[@class='price product-price']");
    By sortedByRates = By.xpath("//div[@class='stars-row full']");

    public List<String> sortByNameZtoA() {
        List<WebElement> actualProducts = driver.findElements(sortedZtoA);
        List<String> actualNames = new ArrayList<String>();
        for (WebElement e : actualProducts) {
            actualNames.add(e.getText());
        }
        return actualNames;
    }

    public List<Object> sortByRating() {
        List<WebElement> originalProductList = driver.findElements(sortedByRates);
        //create the list object
        List<Object> sortPriceList = new ArrayList();
        //add all web element value to list object & Get width of rating
        for (WebElement element : originalProductList) {
            sortPriceList.add(String.valueOf(element.getAttribute("style")));
        }
        return sortPriceList;
    }
    public List<Double> sortingPriceHighToLow(){
        //1.4.1store actual list b4 sorting
        List<WebElement> actualList=driver.findElements(priceHighToLow);
        List<String> actualListPriceString=new ArrayList<>();
        for(WebElement p:actualList){
            actualListPriceString.add(String.valueOf(p.getText().replace("$","")));
        }
        //1.4.2 remove , sign add the double type List
        List<Double> actualListPriceDouble = new ArrayList();
        for (String element : actualListPriceString) {
            actualListPriceDouble.add(Double.valueOf(element.replace(",", "")));
        }
        return actualListPriceDouble;
    }
    public String getBestSellerWelcomeText() {
        return getTextFromElement(bestSellerWelcomeText);
    }

    public void setMouseHoverOnSortBy() {
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void setSelectNameAtoZ() {
        mouseHoverToElementAndClick(selectNameAtoZ);
    }

    public void setSelectNameZtoA() {
        mouseHoverToElementAndClick(selectNameZtoA);
    }

    public void setPriceLowToHigh() {
        mouseHoverToElementAndClick(priceLowToHigh);
    }

    public void setSortingByRates() {
        mouseHoverToElementAndClick(sortingByRates);
    }

    public List<WebElement> sortByRatesAllList() {
        return driver.findElements(verifyProductsSortedByRates);
    }

    public void setClickAddToCartVinylIdolzGhostbusters() {
        mouseHoverToElementAndClick(clickAddToCartVinylIdolzGhostbusters);
    }

    public String getMessageProductAddedToCart() {
        return getTextFromElement(verifyMsgProductAddedToCart);
    }

    public void setCloseTheMessageProductAddedToCart() {
        clickOnElement(closeTheMessageProductAddedToCart);
    }

    public void setClickYourCartIcon() {
        clickOnElement(clickYourCartIcon);
    }

    public void setClickOnViewCartButton() {
        clickOnElement(clickOnViewCartButton);
    }


}
