package org.example.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter {


    @Override
    public void print(Collection<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        System.out.println("************* Summary Report ***********");
        for(int i=1;iterator.hasNext();i++) {
            double orderTotal = 0;
            Order order = iterator.next();
            System.out.println(i+". "+order.getId()+" \t"+order.getDate() + " \t" + order.getItems().size() + " \t" + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("----------------------------------------");
        System.out.println("\tGrand Total "+total);
    }
}
