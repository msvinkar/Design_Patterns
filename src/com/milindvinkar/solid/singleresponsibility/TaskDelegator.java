package com.milindvinkar.solid.singleresponsibility;

public class TaskDelegator {

    // responsibility 3 : delegate task
    public String delegate(Request request) {
        // do processing
        return "Success";
    }
}
