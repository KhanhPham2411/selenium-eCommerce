package pages;

import org.openqa.selenium.WebDriver;

public class AdvancedSearchPage extends BasePage {
	public AdvancedSearchPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/catalogsearch/advanced/";
		this.title = "Advanced Search";
	}
}
