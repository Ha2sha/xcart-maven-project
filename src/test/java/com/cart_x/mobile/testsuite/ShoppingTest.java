package com.cart_x.mobile.testsuite;

import com.cart_x.mobile.pages.*;
import com.cart_x.mobile.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellersPage bestSellersPage = new BestSellersPage();
    YourShoppingCartPage yourShoppingCartPage = new YourShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    SecureCheckOutPage secureCheckOutPage = new SecureCheckOutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForVinylIdolzGhostbusters() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersLink();
        //1.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = bestSellersPage.getBestSellerWelcomeText();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSellersPage.setMouseHoverOnSortBy();
        bestSellersPage.setSelectNameAtoZ();
        Thread.sleep(2000);
        //1.5 Click on “Add to cart” button of the product “VinylIdolzGhostbusters”
        bestSellersPage.setClickAddToCartVinylIdolzGhostbusters();
        //1.6 Verify the message “Product has been added to your cart” display in green bar
        String expectedCartMsg = "Product has been added to your cart";
        String actualCartMsg = bestSellersPage.getMessageProductAddedToCart();
        Assert.assertEquals("Product has not been added to the cart", expectedCartMsg, actualCartMsg);
        //1.7 Click on X sign to close the message
        bestSellersPage.setCloseTheMessageProductAddedToCart();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellersPage.setClickYourCartIcon();
        Thread.sleep(2000);
        bestSellersPage.setClickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedCartMsg2 = "Your shopping cart - 1 item";
        String actualCartMsg2 = yourShoppingCartPage.getTextYourShoppingCart1Item();
        Assert.assertEquals("Text 'Your shopping cart - 1 item' is not displayed", expectedCartMsg2, actualCartMsg2);
        //1.10 Verify the Subtotal $19.99
        Thread.sleep(3000);
        String expectedSubTotal = "$19.99";
        String actualSubTotal = yourShoppingCartPage.getSubTotal();
        Assert.assertEquals("Subtotal is not correct", expectedSubTotal, actualSubTotal);
        //1.11 Verify the total $25.84
        String expectedTotal = "$25.84";
        String actualTotal = yourShoppingCartPage.getExpectedTotal();
        Assert.assertEquals("Total is not correct", expectedTotal, actualTotal);
        //1.12 Click on “Go to checkout” button
        yourShoppingCartPage.setClickOnCheckOutButton();
        //1.13 Verify the text “Log in to your account”
        Thread.sleep(3000);
        String expectedLoginText = "Log in to your account";
        String actualLoginText = loginPage.getTheTextLoginToYourAccount();
        Assert.assertEquals("Text 'Log in to your account' is not displayed", expectedLoginText, actualLoginText);
        //1.14 Enter Email address
        Thread.sleep(3000);
        loginPage.enterEmailAddress("hari122@gmail.com");
        //1.15 Click on “Continue” Button
        loginPage.clickOnContinueButton();
        //1.16 Verify the text “Secure Checkout”
        String expectedCheckOutText = "Secure Checkout";
        String actualCheckOutText = secureCheckOutPage.getTextSecureCheckOut();
        Assert.assertEquals("Text 'Secure Checkout' is not displayed", expectedCheckOutText, actualCheckOutText);
        //1.17 Fill all the mandatory fields
        Thread.sleep(5000);
        secureCheckOutPage.enterFirstname("Hari");
        secureCheckOutPage.enterLastname("Patel");
        secureCheckOutPage.enterAddress("21 Matru Bunglows");
        secureCheckOutPage.enterState("Glasgow City");
        //1.18 Check the check box “Create an account for later use”
        secureCheckOutPage.clickOnCheckBoxCreateYourAccountForLaterUse();
        Thread.sleep(1000);
        //1.19 Enter the password
        secureCheckOutPage.enterPassword("He345a");
        Thread.sleep(2000);
        //1.20 Select the Delivery Method to “Local Shipping”
        secureCheckOutPage.setDeliveryMethodToLocalShipping();
        Thread.sleep(2000);
        //1.21 Select Payment Method “COD”
        secureCheckOutPage.selectPaymentMethodToCOD();
        //1.22 Verify the total $26.86
        String expectedTotal1 = "$26.86";
        String actualTotal1 = secureCheckOutPage.getTheTotal();
        Assert.assertEquals("Total '$26.86' is not displayed", expectedTotal1, actualTotal1);
        //1.23 Click on “Place Order” Button
        Thread.sleep(3000);
        secureCheckOutPage.clickOnPlaceOrderButton();
        //1.24 Verify the text “Thank you for your order”
        String expectedText1 = "Thank you for your order";
        String actualText1 = secureCheckOutPage.getTextThankYouForYourOrder();
        Assert.assertEquals("Text 'Thank you for your order' is not displayed", expectedText1, actualText1);
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.clickOnHotDealLink();
        //1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersLink();
        //1.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = bestSellersPage.getBestSellerWelcomeText();
        Assert.assertEquals("Broken Link", expectedText, actualText);
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSellersPage.setMouseHoverOnSortBy();
        bestSellersPage.setSelectNameAtoZ();
        Thread.sleep(2000);
        //1.5 Click on “Add to cart” button of the product “VinylIdolzGhostbusters”
        bestSellersPage.setClickAddToCartVinylIdolzGhostbusters();
        //1.6 Verify the message “Product has been added to your cart” display in green bar
        String expectedCartMsg = "Product has been added to your cart";
        String actualCartMsg = bestSellersPage.getMessageProductAddedToCart();
        Assert.assertEquals("Product has not been added to the cart", expectedCartMsg, actualCartMsg);
        //1.7 Click on X sign to close the message
        bestSellersPage.setCloseTheMessageProductAddedToCart();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellersPage.setClickYourCartIcon();
        Thread.sleep(2000);
        bestSellersPage.setClickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedCartMsg2 = "Your shopping cart - 1 item";
        String actualCartMsg2 = yourShoppingCartPage.getTextYourShoppingCart1Item();
        Assert.assertEquals("Text 'Your shopping cart - 1 item' is not displayed", expectedCartMsg2, actualCartMsg2);
        //1.10 Click on “Empty your cart” link
        yourShoppingCartPage.setClickOnEmptyYourCartLink();
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        switchToAlert();
        String expectedAlertMessage = "Are you sure you want to clear your cart?";
        String actualAlertMessage=getTextAlert();
        Assert.assertEquals("Alert message is not the same", expectedAlertMessage,actualAlertMessage);
        //1.12 Click “Ok” on alert
        acceptAlert();
        //1.13 Verify the message “Item(s) deleted from your cart”
        String expectedCartMsg1="Item(s) deleted from your cart";
        Thread.sleep(3000);
        String actualCartMsg1=yourShoppingCartPage.getTextItemsDeletedFromYourCart();
        Assert.assertEquals("Product has not been added to the cart",expectedCartMsg1,actualCartMsg1);
        //1.14 Verify the text “Your cart is empty”
        String expectedText3 = "Your cart is empty";
        String actualText3 = yourShoppingCartPage.getTextYourCartIsEmpty();
        Assert.assertEquals("Text 'Your cart is empty' is not displayed", expectedText3, actualText3);

    }

}
