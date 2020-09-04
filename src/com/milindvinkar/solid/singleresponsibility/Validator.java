package com.milindvinkar.solid.singleresponsibility;

public class Validator {

    // responsibility 1 : check request is valid
    public boolean isValid(Request request) {
        return request.getUrl() != null && request.getParams().length == 2;
    }
}
