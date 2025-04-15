package org.example.state;

public class InTransit implements OrderState {

    @Override
    public double handleCancellation() {
        double charges = 10;
        System.out.println("Order cancellation initiated. Cancellation charges will be $" + charges);
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway to roll back the transaction");
        return charges;
    }



}
