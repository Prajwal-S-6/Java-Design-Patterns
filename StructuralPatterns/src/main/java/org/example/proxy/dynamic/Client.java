package org.example.proxy.dynamic;

import org.example.proxy.Image;
import org.example.proxy.Point2D;

public class Client {

	public static void main(String[] args) {
		Image myImage = ImageFactory.getImage("img.png");
		myImage.setLocation(new Point2D(11,11));
		System.out.println(myImage.getLocation());
		myImage.render();

	}
}
