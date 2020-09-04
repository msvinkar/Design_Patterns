package com.milindvinkar.patterns.factorymethod;

public class App {

    public static void main(String[] args) {
        System.out.println(new TextMessageCreator()
                .create()
                .getType());

        System.out.println(new JSONMessageCreator()
                .create()
                .getType());
    }
}
