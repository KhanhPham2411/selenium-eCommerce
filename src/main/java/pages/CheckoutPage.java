package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

	@FindBy(id = "billing:street1")
	WebElement billingAddress;

	@FindBy(id = "billing:city")
	WebElement billingCity;

	@FindBy(id = "billing:region_id")
	WebElement region;

	@FindBy(id = "billing:country_id")
	WebElement billingCountry;

	@FindBy(id = "billing:postcode")
	WebElement postCode;
	
	@FindBy(id = "billing:telephone")
	WebElement telephone;

	@FindBy(css = "button[title=\"Continue\"]")
	WebElement btnContinue;

	@FindBy(xpath = "//div[@id='checkout-step-shipping_method']//button")
	WebElement btnSippingMethodContinue;

	@FindBy(xpath = "//div[@id='checkout-step-payment']//button")
	WebElement btnPaymentContinue;

	@FindBy(xpath = "//label[contains(text(), 'Fixed')]/span")
	WebElement flatRate;

	@FindBy(id="p_method_checkmo")
	WebElement radioCheckMoneyOrder;

	@FindBy(css ="button[title=\"Place Order\"]")
	WebElement btnPlaceOrder;

	@FindBy(xpath = "//p[text()='Your order # is: ']/a")
	WebElement orderNumber;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/checkout/onepage/";
		this.title = "Checkout";
	}

	public void checkOut(){
		enterShippingInformation();

		clickContinue();

	}

	public void enterShippingInformation(){
		billingAddress.sendKeys("ABC");

		billingCity.sendKeys("New York");
		new Select(region).selectByVisibleText("New York");
		postCode.sendKeys("542896");
		new Select(billingCountry).selectByValue("US");
		telephone.sendKeys("12345678");
	}

	public void clickContinue(){
		btnContinue.click();
	}
	public void continueShippingMethodStep(){
		btnSippingMethodContinue.click();
	}

	public String getFlatRate(){
		return flatRate.getText();
	}

	public Boolean isFlatRateCorrect(String flatRate){
		String patternStr = "$[0-9]*.[0-9]*";
		Pattern pattern = Pattern.compile(patternStr);

		Matcher matcher = pattern.matcher(flatRate);
		boolean matchFound = matcher.lookingAt();
		return matchFound;
	}

	public void selectCheckMoneyOrder(){
		radioCheckMoneyOrder.click();
	}

	public void continuePaymentStep(){
		btnPaymentContinue.click();
	}

	public void clickPlaceOrder(){
		btnPlaceOrder.click();
	}

	public String getOrderNumbder(){
		return orderNumber.getText();
	}

	public Boolean isOrderNumberGenerated(){
		return isOrderNumberGenerated(getOrderNumbder());
	}

	public Boolean isOrderNumberGenerated(String orderNumber){
		return !orderNumber.isEmpty();
	}
}
