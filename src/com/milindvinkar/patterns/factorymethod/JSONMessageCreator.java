package com.milindvinkar.patterns.factorymethod;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message create() {
        return new JsonMessage();
    }
}
