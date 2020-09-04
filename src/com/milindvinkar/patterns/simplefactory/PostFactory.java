package com.milindvinkar.patterns.simplefactory;

public class PostFactory {

    public static Post getPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new RuntimeException("Invalid type");
        }
    }

}
