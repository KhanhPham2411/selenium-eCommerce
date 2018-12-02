package pages;

import org.openqa.selenium.WebDriver;

public class CustomerServicePage extends BasePage {
	public CustomerServicePage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/customer-service/";
		this.title = "Customer Service";
	}
}
