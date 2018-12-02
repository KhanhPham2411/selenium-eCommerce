package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePage extends BasePage {

	@FindBy(css = "button[title=\"Add to Cart\"]")
	WebElement buttonAddToCart;

	public MobilePage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/mobile.html?dir=desc&order=position";
		this.title = "Mobile";
	}

	public void addToCart(){
		buttonAddToCart.click();
	}
}
