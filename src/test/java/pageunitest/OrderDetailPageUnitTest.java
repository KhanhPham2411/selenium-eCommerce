package pageunitest;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;
import models.Order;
import pages.OrderDetailPage;

public class OrderDetailPageUnitTest {
	
	@Test
	public void testGetOrderList(){
		List<Order> orderList = new ArrayList<Order>();
		OrderDetailPage page;
		
		Assert.assertTrue(true);
	}
}
