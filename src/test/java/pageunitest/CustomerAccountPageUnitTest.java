package pageunitest;

import java.util.List;
import org.testng.annotations.Test;
import junit.framework.Assert;
import models.Order;
import pages.CustomerAccountPage;

public class CustomerAccountPageUnitTest extends BaseUnitTestCase {
	
	@Test
	public void testGetOrderList(){
		CustomerAccountPage customerAccountPage = new CustomerAccountPage(driver);
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
		
		Assert.assertTrue(true);
	}
}
