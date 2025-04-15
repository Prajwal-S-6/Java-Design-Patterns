package org.example.state;

public class Cancelled implements OrderState {


    @Override
    public double handleCancellation() {
        throw new IllegalCallerException("Cannot cancel already cancelled order!!!");
    }
}
