package org.example.simple.factory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 * If objects are created based on some criteria then that logic is moved out of client code and separate Class, static method
 * is created to get the objects
 */
public class PostFactory {

    public static Post getPost(String post) {
        switch (post) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
            default:
                return new ProductPost();
        }
    }

}
