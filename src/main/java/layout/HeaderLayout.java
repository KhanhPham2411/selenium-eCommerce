package layout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderLayout {
	WebDriver driver;
	
	@FindBy(css="div.account-cart-wrapper > a")
	WebElement menuAccount;
	
	@FindBy(css="a[title=\"My Account\"]")
	WebElement subMenuMyAccount;

	@FindBy(xpath="//a[contains(text(),'My Wishlist')]")
	WebElement subMenuMyWishlist;
	
	public HeaderLayout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMyAccount(){
		menuAccount.click();
		subMenuMyAccount.click();
	}
	public void clickMyWishlist(){
		menuAccount.click();
		subMenuMyWishlist.click();
	}
}
