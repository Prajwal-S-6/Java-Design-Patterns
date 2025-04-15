package org.example.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        double charges = 20;
        System.out.println("Order cancellation initiated. Cancellation charges will be $" + charges);
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return charges;
    }

}
