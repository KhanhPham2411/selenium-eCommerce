package pageunitest;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;
import models.Order;
import pages.CustomerAccountPage;

public class CustomerAccountPageUnitTest {
	
	@Test
	public void testGetOrderList(){
		List<Order> orderList = new ArrayList<Order>();
		CustomerAccountPage page;
		
		Assert.assertTrue(true);
	}
}
