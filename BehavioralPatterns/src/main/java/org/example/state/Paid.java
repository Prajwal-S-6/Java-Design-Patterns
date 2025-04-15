package org.example.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        double charges = 2;
        System.out.println("Order cancellation initiated. Cancellation charges will be $" + charges);
        System.out.println("Contacting payment gateway to rollback the transaction");
        return charges;
    }
}
