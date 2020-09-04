package com.milindvinkar.patterns.factorymethod;

class JsonMessage extends Message {
    @Override
    public String getType() {
        return "Json";
    }
}
