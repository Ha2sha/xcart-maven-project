package com.cart_x.mobile.testsuite;

import com.cart_x.mobile.pages.BestSellersPage;
import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.SalePage;
import com.cart_x.mobile.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSellersPage bestSellersPage = new BestSellersPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //1.2 Mouse hover on the “Sale”  link and click
        homePage.clickSaleLink();
        //1.3 Verify the text “Sale”
        String expectedText = "Sale";
        String actualText = salePage.getWelcomeTextSale();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //b4 sorting
        List<String> actualNames = new ArrayList<String>();
        actualNames = salePage.sortByNameAtoZ();
        //sort A to Z
        Collections.sort(actualNames);

        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        salePage.setMouseHoverOnSortBy();
        salePage.setSelectNameAtoZ();
        //1.5 Verify that the product arrange alphabetically
        //after sorting
        List<String> sortedNames = new ArrayList<String>();
        sortedNames = salePage.sortByNameAtoZ();
        Assert.assertEquals("Sorting product names from A to Z is not working", actualNames, sortedNames);

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //2.2 Mouse hover on the “Sale”  link and click
        homePage.clickSaleLink();
        //2.3 Verify the text “Sale”
        String expectedText = "Sale";
        String actualText = salePage.getWelcomeTextSale();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        Thread.sleep(2000);
        //List of Product b4 sorting
        List<Double> actualPrice = salePage.sortingPriceLowToHigh();
        //sorting of collection
        Thread.sleep(2000);
        Collections.sort(actualPrice);
        System.out.println(actualPrice);
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        salePage.setMouseHoverOnSortBy();
        salePage.setSelectPriceLowToHigh();
        //2.5 Verify that the product’s price arrange Low to High
        Thread.sleep(2000);
        //List of Product after sorting
        List<Double> sortedPrice = salePage.sortingPriceLowToHigh();
        System.out.println(sortedPrice);
        Assert.assertEquals("Sorting product prices from Low to High is not working", actualPrice, sortedPrice);
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //3.2 Mouse hover on the “Sale”  link and click
        homePage.clickSaleLink();
        //3.3 Verify the text “Sale”
        String expectedText = "Sale";
        String actualText = salePage.getWelcomeTextSale();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //b4 sorting
        List<Object> sortPriceList = salePage.sortByRating();
        Thread.sleep(1000);
        Collections.sort(sortPriceList, Collections.reverseOrder());

        //3.4 Mouse hover on “Sort By” and select “Rates”
        salePage.setMouseHoverOnSortBy();
        salePage.setSelectRates();
        //3.5 Verify that the product’s arrange by Rates
        Thread.sleep(1000);
        List<Object> actualPriceList = salePage.sortByRating();

        Assert.assertEquals("Not sorted by Rates", sortPriceList, actualPriceList);


    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        //4.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //4.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersLink();
        //4.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = bestSellersPage.getBestSellerWelcomeText();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //b4 sorting
        List<String> actualNames = bestSellersPage.sortByNameZtoA();
        //sort Z to A
        Collections.sort(actualNames);
        Collections.reverse(actualNames);
        //4.4 Mouse hover on “Sort By” and select “Name Z-A”
        bestSellersPage.setMouseHoverOnSortBy();
        bestSellersPage.setSelectNameZtoA();
        //4.5 Verify that the product arrange by Z to A
        List<String> sortedNames = bestSellersPage.sortByNameZtoA();
        Assert.assertEquals("Sorting product names from Z to A is not working", actualNames, sortedNames);

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //5.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //5.2 Mouse hover on the “Bestsellers” link and click
        homePage.clickOnBestSellersLink();
        //5.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = bestSellersPage.getBestSellerWelcomeText();
        Assert.assertEquals("Broken Link", expectedText, actualText);

        //List of Product b4 sorting
        List<Double> actualPrice = bestSellersPage.sortingPriceHighToLow();
        //sorting of collection
        Thread.sleep(2000);
        Collections.sort(actualPrice);
        Collections.reverse(actualPrice);
        System.out.println(actualPrice);
        //5.4 Mouse hover on “Sort By” and select “Price High-Low”
        bestSellersPage.setMouseHoverOnSortBy();
        bestSellersPage.setPriceLowToHigh();
        //5.5 Verify that the product’s price arrange High to Low
        List<Double> sortedPrice = bestSellersPage.sortingPriceHighToLow();
        System.out.println(sortedPrice);
        Assert.assertEquals("Sorting product by rates is not working", actualPrice, sortedPrice);

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        //6.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //6.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersLink();
        //6.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = bestSellersPage.getBestSellerWelcomeText();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //6.5 Verify that the product’s arrange Rates
        //b4 sorting
        List<Object> sortPriceList = bestSellersPage.sortByRating();
        Thread.sleep(1000);
        Collections.sort(sortPriceList, Collections.reverseOrder());

        //6.4 Mouse hover on “Sort By” and select “Rates”
        bestSellersPage.setMouseHoverOnSortBy();
        bestSellersPage.setSortingByRates();
        //after sorting
        Thread.sleep(1000);
        List<Object> actualPriceList = bestSellersPage.sortByRating();

        Assert.assertEquals("Not sorted by Rates", sortPriceList, actualPriceList);
    }


}
