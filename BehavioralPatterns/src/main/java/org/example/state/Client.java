package org.example.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.paymentSuccessful();
        order.cancel();
    }
}
