package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import models.User;

public class CreateNewCustomerAccountPage extends BasePage {
	public CreateNewCustomerAccountPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/customer/account/create/";
		this.title = "Create New Customer Account";
	}
	
	public Boolean createAccount(User user) {
		driver.findElement(By.id("firstname")).sendKeys(user.firstName);
        driver.findElement(By.id("lastname")).sendKeys(user.lastName);
        driver.findElement(By.id("email_address")).sendKeys(user.email);
        driver.findElement(By.id("password")).sendKeys(user.password);
        driver.findElement(By.id("confirmation")).sendKeys(user.confirmPassword);
		driver.findElement(By.cssSelector("button[title=\"Register\"]")).click();
		
		return isRedirected();
	}
}
