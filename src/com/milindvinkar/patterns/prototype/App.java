package com.milindvinkar.patterns.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype base = new Prototype();
        Object clone = base.clone();

        System.out.println(base);
        System.out.println(clone);

    }
}
