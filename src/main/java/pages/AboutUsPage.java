package pages;

import org.openqa.selenium.WebDriver;

public class AboutUsPage extends BasePage {
	public AboutUsPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/about-magento-demo-store/";
		this.title = "About Us";
	}
}
