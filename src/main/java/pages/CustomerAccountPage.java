package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pagedom.CustomerAccountPageDom;

public class CustomerAccountPage extends BasePage {

	@FindBy(xpath = "//a[text() = 'My Orders']")
	WebElement menuMyOrders;

	@FindBy(xpath = "//a[text() = 'View Order']")
	WebElement viewOrder;


	private CustomerAccountPageDom document;

	public CustomerAccountPage(WebDriver driver) {
		super(driver);
		
		setDocument(new CustomerAccountPageDom(driver));
		PageFactory.initElements(driver, document);

		this.url = "http://live.guru99.com/index.php/customer/account/";
		this.title = "My Account";
	}

	/**
	 * @return the document
	 */
	public CustomerAccountPageDom getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(CustomerAccountPageDom document) {
		this.document = document;
	}

	public void clickMenuMyOrders() {
		menuMyOrders.click();
	}

	public void clickViewOrder(){
		viewOrder.click();
	}
}
