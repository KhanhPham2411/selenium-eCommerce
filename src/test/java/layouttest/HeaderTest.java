package layouttest;

import org.testng.annotations.Test;

import pages.HomePage;
import test.BaseTestCase;

public class HeaderTest extends BaseTestCase {

	@Test
	public void testClickMyWishlist(){
		HomePage homePage = new HomePage(driver);
		homePage.start();
		homePage.getHeader().clickMyWishlist();
	}
}
