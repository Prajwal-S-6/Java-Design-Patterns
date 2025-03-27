package org.example.simple.factory;

public class Client {

	public static void main(String[] args) {

		NewsPost myPost = (NewsPost) PostFactory.getPost("news");
		myPost.setHeadline("breaking news");
		System.out.println(myPost.getHeadline());

	}

}
