package org.example.facade;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
