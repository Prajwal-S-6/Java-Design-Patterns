package org.example.Decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message htmlEncoded = new HtmlEncodedMessage(m);
		System.out.println(htmlEncoded.getContent());

		Message base64Encoded = new Base64EncodedMessage(htmlEncoded);
		System.out.println(base64Encoded.getContent());

	}
}
