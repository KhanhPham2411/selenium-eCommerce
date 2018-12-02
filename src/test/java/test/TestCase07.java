package test;

import org.testng.annotations.Test;

import pages.CustomerAccountPage;
import pages.OrderDetailPage;

public class TestCase07 extends BaseTestCaseWithLogin {
	@Test
	public void VerifyPlacedOrder() {
		CustomerAccountPage customerAccountPage = new CustomerAccountPage(driver);
		customerAccountPage.getDocument().clickMyOrdersLink();
		customerAccountPage.getDocument().clickViewOrderLink();

		OrderDetailPage orderDetailPage = new OrderDetailPage(driver);
		orderDetailPage.getDocument().clickPrintOrderLink();
	}
}
