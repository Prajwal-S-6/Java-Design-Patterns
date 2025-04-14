package org.example.observer;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double itemCost = order.getItemCost();
        if(itemCost > 500) {
            order.setDiscount(50);
        } else if(itemCost > 200) {
            order.setDiscount(10);
        }
    }
}
