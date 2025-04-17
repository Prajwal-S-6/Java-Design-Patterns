package org.example.templatemethod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

//Abstract base class defines the template method
public abstract class OrderPrinter {

    public void printOrder(Order order, String fileName) throws IOException {
        try(PrintWriter printWriter = new PrintWriter(fileName)) {
            printWriter.println(start());
            printWriter.println(formatOrderNumber(order));
            printWriter.println(formatItems(order));
            printWriter.println(formatTotal(order));
            printWriter.println(end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrderNumber(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    protected abstract String end();

}
