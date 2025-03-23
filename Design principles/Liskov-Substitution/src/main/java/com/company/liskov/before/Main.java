package com.company.liskov.before;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
		useRectangle(square);

	}

	// violation of liskov substitution principle -- because we are not able to substitute child base class object with child class
	// because when we use child class object the behavior has changes
	// meaning - In base class when we used to set height and width and get the value it used to give value for height and width
	// but with child class setting height will set both height and width
	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}
