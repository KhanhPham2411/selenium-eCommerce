package pages;

import org.openqa.selenium.WebDriver;

public class PrivacyPolicyPage extends BasePage {
	public PrivacyPolicyPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/privacy-policy-cookie-restriction-mode/";
		this.title = "Privacy Policy";
	}
}
