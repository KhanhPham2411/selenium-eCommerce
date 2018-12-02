package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ShoppingCartPage;

import org.openqa.selenium.By;

public class TestCase06 extends TestCase05{

	@Test
	public void verifyPurchaseProduct() {
		this.verifyMobileListPage();

		HomePage homePage = new HomePage(driver);
		homePage.open();
		homePage.getHeader().clickMyWishlist();
		
		driver.findElement(By.cssSelector("button[title=\"Add to Cart\"]")).click();
		
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.proceedToCheckout();
	}
}
