package org.example.factorymethod;


public class Client {

	public static void main(String[] args) {
		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		System.out.println(creator.getMessage().getContent());
	}
}
