package com.milindvinkar.solid.singleresponsibility;

public class RequestHandlerWithoutSingleResponsibility {

    // responsibility 1  : accept request and delegate
    public String handle(Request request) {

        // responsibility 2 : check request is valid
        boolean isValid = request.getUrl() != null && request.getParams().length == 2;

        if (isValid) {
            // responsibility 3 : delegate task
            // do processing
            return "Success";
        }

        return "Failure";
    }
}
