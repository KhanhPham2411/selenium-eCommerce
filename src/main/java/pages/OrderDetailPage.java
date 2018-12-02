package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagedom.OrderDetailPageDom;

public class OrderDetailPage  extends BasePage {


	private OrderDetailPageDom document;

	public OrderDetailPage(WebDriver driver) {
		super(driver);
		
		setDocument(new OrderDetailPageDom(driver));
		PageFactory.initElements(driver, document);

		this.url = "http://live.guru99.com/index.php/sales/order/view/order_id";
		this.title = "Order";
	}

	/**
	 * @return the document
	 */
	public OrderDetailPageDom getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(OrderDetailPageDom document) {
		this.document = document;
	}
}
