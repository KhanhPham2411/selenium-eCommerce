package pages;

import org.openqa.selenium.WebDriver;

public class MagentoCommercePage extends BasePage {
	public MagentoCommercePage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/sales/guest/form/";
		this.title = "Magento Commerce";
	}
}
