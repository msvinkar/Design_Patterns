package com.milindvinkar.solid.singleresponsibility;

public class RequestHandlerWithSingleResponsibility {

    private Validator validator = new Validator();
    private TaskDelegator taskDelegator = new TaskDelegator();

    // responsibility 1  : accept request and delegate
    public String handle(Request request) {
        boolean isValid = validator.isValid(request);
        if (isValid) {
            return taskDelegator.delegate(request);
        }

        return "FAILED";
    }
}
