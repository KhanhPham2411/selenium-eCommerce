package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/checkout/cart/";
		this.title = "Shopping Cart";
	}

	public void proceedToCheckout(){
		driver.findElement(By.cssSelector("button[title=\"Proceed to Checkout\"]")).click();
	}
	
}
