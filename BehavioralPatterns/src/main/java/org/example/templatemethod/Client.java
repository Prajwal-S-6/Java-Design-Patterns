package org.example.templatemethod;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");
		order.addItem("Pen", 10);
		order.addItem("Book", 20);
		order.addItem("Pencil", 5);

		OrderPrinter orderPrinter = new HtmlPrinter();
		OrderPrinter orderPrinter1 = new TextPrinter();
		orderPrinter.printOrder(order, "1001.html");
		orderPrinter1.printOrder(order, "1001.txt");
	}
}
