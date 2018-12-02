package pages;

import org.openqa.selenium.WebDriver;

public class SearchTermsPage extends BasePage {
	public SearchTermsPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/catalogsearch/term/popular/";
		this.title = "Search Terms";
	}
}
