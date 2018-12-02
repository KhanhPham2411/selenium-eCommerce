package pages;

import org.openqa.selenium.WebDriver;

public class ForgotYourPasswordPage extends BasePage {
	public ForgotYourPasswordPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/customer/account/forgotpassword/";
		this.title = "Forgot Your Password";
	}
}
