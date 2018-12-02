package test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import models.Order;
import pages.CustomerAccountPage;
import pages.OrderDetailPage;

public class TestCase07 extends BaseTestCaseWithLogin {
	@Test
	public void VerifyPlacedOrder() {
		CustomerAccountPage customerAccountPage = new CustomerAccountPage(driver);
		customerAccountPage.getDocument().clickMyOrdersLink();

		List<Order> orderList = customerAccountPage.getOrderList();
		Assert.assertEquals(orderList.get(0).getStatus(), "Pending");

		customerAccountPage.getDocument().clickViewOrderLink();

		OrderDetailPage orderDetailPage = new OrderDetailPage(driver);
		orderDetailPage.getDocument().clickPrintOrderLink();
	}
}
