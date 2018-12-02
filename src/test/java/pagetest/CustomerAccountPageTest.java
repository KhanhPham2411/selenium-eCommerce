package pagetest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import models.Order;
import pages.CustomerAccountPage;
import test.BaseTestCaseWithLogin;

public class CustomerAccountPageTest extends BaseTestCaseWithLogin {
    @Test
	public void testGetOrderList(){
        CustomerAccountPage customerAccountPage = new CustomerAccountPage(driver);
        customerAccountPage.open();

        List<Order> orderList = customerAccountPage.getOrderList();

        Assert.assertTrue(orderList.size() > 0);

        Order orderItem = orderList.get(0);
        Assert.assertEquals("100008370", orderItem.getOrderId());
        Assert.assertEquals("11/28/2018", orderItem.getDate());
        Assert.assertEquals("Khanh Pham", orderItem.getShipTo());
        Assert.assertEquals("$3,875.00", orderItem.getOrderTotal());
        Assert.assertEquals("Pending", orderItem.getStatus());
        Assert.assertEquals("http://live.guru99.com/index.php/sales/order/view/order_id/8417/", orderItem.getOrderLink());
        Assert.assertEquals("http://live.guru99.com/index.php/sales/order/reorder/order_id/8417/", orderItem.getReorderLink());
    }
}
