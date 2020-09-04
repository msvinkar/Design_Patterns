package com.milindvinkar.patterns.prototype;

public class State {

    private int id;

    public State(int id) {
        this.id = id;
    }

    public State setId(int id) {
        this.id = id;
        return this;
    }
}
