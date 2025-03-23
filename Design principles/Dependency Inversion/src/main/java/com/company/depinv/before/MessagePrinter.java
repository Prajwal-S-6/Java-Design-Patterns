package com.company.depinv.before;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// tight coupling of JSONFormatter and PrintWrite
	// lets say we want to change the message format then this class also has to be modified, same applies for print as well
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();//creates formatter
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		}
	}
}
