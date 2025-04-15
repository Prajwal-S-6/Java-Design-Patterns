package org.example.state;

public class New implements OrderState {


    @Override
    public double handleCancellation() {
        System.out.println("Order cancellation initiated");
        return 0;
    }
}
