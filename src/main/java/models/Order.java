package models;

public class Order {
	String orderId;
	String date;
	String shipTo;
	String otderTotal;
	String status;
	String orderLink;
	String reorderLink;
	
	public String getOrderLink() {
		return orderLink;
	}
	public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
	}
	public String getReorderLink() {
		return reorderLink;
	}
	public void setReorderLink(String reorderLink) {
		this.reorderLink = reorderLink;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public String getOtderTotal() {
		return otderTotal;
	}
	public void setOtderTotal(String otderTotal) {
		this.otderTotal = otderTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
