package com.company.depinv.after;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		Formatter formatter = new JSONFormatter();
		try(PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, formatter, writer);
		}

	}

}
