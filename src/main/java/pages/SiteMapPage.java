package pages;

import org.openqa.selenium.WebDriver;

public class SiteMapPage extends BasePage {
	public SiteMapPage(WebDriver driver) {
		super(driver);
		
		this.url = "http://live.guru99.com/index.php/catalog/seo_sitemap/category/";
		this.title = "Site Map";
	}
}
