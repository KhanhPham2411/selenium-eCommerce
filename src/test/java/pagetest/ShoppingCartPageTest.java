package pagetest;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ShoppingCartPage;

public class ShoppingCartPageTest extends CustomerLoginPageTest {
    @Test
	public void testProceedToCheckout(){
        this.testLogin();
        ShoppingCartPage page = new ShoppingCartPage(driver);
        page.open();
        page.proceedToCheckout();
        Assert.assertTrue(page.isRedirected());
    }
}
