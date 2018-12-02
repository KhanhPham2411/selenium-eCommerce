package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import models.Order;
import pagedom.CustomerAccountPageDom;

public class CustomerAccountPage extends BasePage {
	private CustomerAccountPageDom document;
	
	@FindBy(id = "my-orders-table")
	WebElement orderTable;

	public CustomerAccountPage(WebDriver driver) {
		super(driver);
		
		setDocument(new CustomerAccountPageDom(driver));
		PageFactory.initElements(driver, document);

		this.url = "http://live.guru99.com/index.php/customer/account/";
		this.title = "My Account";
	}

	/**
	 * @return the document
	 */
	public CustomerAccountPageDom getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(CustomerAccountPageDom document) {
		this.document = document;
	}

	public List<Order> getOrderList(){
		List<Order> orderList = new ArrayList<Order>();

		List<WebElement> rows = orderTable.findElements(By.xpath(".//tbody/tr"));
		for(WebElement row : rows){
			Order order = new Order();
			order.setOrderId(row.findElement(By.className("number")).getText());
			order.setDate(row.findElement(By.className("date")).getText());
			order.setShipTo(row.findElement(By.className("ship")).getText());
			order.setOrderTotal(row.findElement(By.className("total")).getText());
			order.setStatus(row.findElement(By.className("status")).getText());
			order.setOrderLink(row.findElement(By.linkText("VIEW ORDER")).getAttribute("href"));
			order.setReorderLink(row.findElement(By.linkText("REORDER")).getAttribute("href"));

			orderList.add(order);
		}

		return orderList; 
	}
}
