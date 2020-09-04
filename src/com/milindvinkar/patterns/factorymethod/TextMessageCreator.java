package com.milindvinkar.patterns.factorymethod;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message create() {
        return new TextMessage();
    }
}
