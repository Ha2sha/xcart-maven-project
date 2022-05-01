package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SalePage extends Utility {
    By welcomeTextSale = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectNameAtoZ = By.linkText("Name A - Z");
    By selectPriceLowToHigh = By.linkText("Price Low - High");
    By selectRates=By.linkText("Rates");
    By verifyProductsSortedByRates=By.xpath("//ul[@class='products-grid grid-list']");
    By sortLowToHigh=By.xpath("//div[@class='items-list items-list-products sale-products']//span[@class='price product-price']");
    By sortByAtoZLink = By.xpath("//ul[@class='display-sort sort-crit grid-list']//li//a");
    By sortedByRates=By.xpath("//div[@class='stars-row full']");

    public void setMouseHoverOnSortBy() {
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void setSelectNameAtoZ() {
        mouseHoverToElementAndClick(selectNameAtoZ);
    }

    public String getWelcomeTextSale() {
        return getTextFromElement(welcomeTextSale);
    }

    public void setSelectPriceLowToHigh(){
        mouseHoverToElementAndClick(selectPriceLowToHigh);
    }
    public void setSelectRates(){
        mouseHoverToElementAndClick(selectRates);
    }

    public List<WebElement> setVerifyProductsSortedByRates(){
       return  driver.findElements(verifyProductsSortedByRates);
    }
 public List<String> sortByNameAtoZ(){
    List<WebElement> actualProducts = driver.findElements(sortByAtoZLink);
    List<String> actualNames = new ArrayList<String>();
        for (WebElement e : actualProducts) {
        actualNames.add(e.getText());
    }
    return actualNames;
    }


    public List<Double> sortingPriceLowToHigh(){
        //1.4.1store actual list b4 sorting
        List<WebElement> actualList=driver.findElements(sortLowToHigh);
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
}

