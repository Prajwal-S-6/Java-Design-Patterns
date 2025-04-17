package org.example.templatemethod;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter {


    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("-----------------------------------\n");
        for(Map.Entry<String, Double> item : order.getItems().entrySet()) {
            builder.append("\t"+item.getKey()+" $"+item.getValue()+"\n");
        }
        builder.append("\n-------------------------------------");
        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total : $" + order.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }
}
