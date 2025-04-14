package org.example.observer;

public class Client {

    public static void main(String[] args) {
        Order order1= new Order("1001");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order1.attach(priceObserver);
        order1.attach(quantityObserver);

        order1.addItem(50);
        System.out.println(order1);
        System.out.println("-----------------------------------------");
        order1.addItem(250);
        System.out.println(order1);
        System.out.println("-----------------------------------------");
        order1.addItem(250);
        System.out.println(order1);
    }
}
