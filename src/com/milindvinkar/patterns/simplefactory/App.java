package com.milindvinkar.patterns.simplefactory;

public class App {

    public static void main(String[] args) {

        PostFactory.getPost("news").post();
    }
}
