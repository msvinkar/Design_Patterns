package com.milindvinkar.patterns.factorymethod;

class TextMessage extends Message {
    @Override
    public String getType() {
        return "Text";
    }
}
