package com.milindvinkar.patterns.prototype;

public class NonClonableObject implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("You can't clone me !");
    }
}
