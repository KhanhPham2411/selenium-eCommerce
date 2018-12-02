package pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CustomerLoginPage;
import test.BaseTestCase;

public class CustomerLoginPageTest extends BaseTestCase {
	@Test
	public void testLogin() {
		CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
		customerLoginPage.start();
		customerLoginPage.login();
		Assert.assertTrue(customerLoginPage.isRedirected());
	}
}
