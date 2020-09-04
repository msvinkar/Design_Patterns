package com.milindvinkar.solid.singleresponsibility;

public class Request {
    private String url;
    private String[] params;

    public Request(String url, String[] params) {
        this.url = url;
        this.params = params;
    }

    public String getUrl() {
        return url;
    }

    public String[] getParams() {
        return params;
    }
}
