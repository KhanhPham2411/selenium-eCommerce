package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/";
		this.title = "Home page";
	}
}
