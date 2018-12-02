package pages;

import org.openqa.selenium.WebDriver;

public class TVPage extends BasePage {
	public TVPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/tv.html";
		this.title = "TV";
	}
}
