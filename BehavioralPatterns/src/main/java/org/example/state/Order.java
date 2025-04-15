package org.example.state;

//Context class
public class Order {

	private OrderState orderState;

	public Order() {
		this.orderState = new New();
	}

	public double cancel() {
		this.orderState.handleCancellation();
		this.orderState = new Cancelled();
		return 0;
	}
   
	public void paymentSuccessful() {
		this.orderState = new Paid();
	}
	
	public void dispatched() {
		this.orderState = new InTransit();
	}
	
	public void delivered() {
		this.orderState = new Delivered();
	}
}
