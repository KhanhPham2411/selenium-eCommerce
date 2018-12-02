package pages;

import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage {
	public ContactUsPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/contacts/";
		this.title = "Contact Us";
	}
}
