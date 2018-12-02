package pagetest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataAccess.UserDataAccess;
import models.User;
import pages.CheckoutPage;
import pages.CreateNewCustomerAccountPage;
import pages.MobilePage;
import pages.ShoppingCartPage;
import test.BaseTestCase;

public class CheckoutPageTest extends BaseTestCase {

    @Test
	public void testEnterShippingInformation(){
        CreateNewCustomerAccountPage accountPage = new CreateNewCustomerAccountPage(driver);
        accountPage.start();

        User newUser = new UserDataAccess().getUser();
        Assert.assertTrue(accountPage.createAccount(newUser));

        MobilePage mobilePage = new MobilePage(driver);
        mobilePage.open();
        mobilePage.addToCart();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterShippingInformation();

        checkoutPage.clickContinue();

        checkoutPage.continueShippingMethodStep();
        checkoutPage.selectCheckMoneyOrder();
        checkoutPage.continuePaymentStep();
        
        checkoutPage.clickPlaceOrder();
        Assert.assertTrue(checkoutPage.isOrderNumberGenerated());
    }


    @Test(dataProvider = "getTestDataIsFlatRateCorrect")
    public void testIsFlatRateCorrect(String flatRate, Boolean expected){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(checkoutPage.isFlatRateCorrect(flatRate), expected);
    }

    @DataProvider(name = "getTestDataIsFlatRateCorrect")
   public Object[][] getTestDataIsFlatRateCorrect(){
       return new Object[][] {
           {"$70.00", true},
           {"$120.00", true},
       };
   }
}
