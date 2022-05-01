package com.cart_x.mobile.testsuite;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.TopMenuPage;
import com.cart_x.mobile.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String expectedText="Shipping";
        String actualText=topMenuPage.getShippingWelcomeText();
        Assert.assertEquals("Broken Link",expectedText,actualText);
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homePage.clickOnNewLink();
        String expectedText="New arrivals";
        String actualText=topMenuPage.getnewWelcomeText();
        Assert.assertEquals("Broken Link",expectedText,actualText);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        String expectedText="Coming soon";
        String actualText=topMenuPage.getComingSoonWelcomeText();
        Assert.assertEquals("Broken Link",expectedText,actualText);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        String expectedText="Contact us";
        String actualText=topMenuPage.getContactUsWelcomeText();
        Assert.assertEquals("Broken Link",expectedText,actualText);
    }
}
