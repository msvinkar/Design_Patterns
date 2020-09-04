package com.milindvinkar.solid.interfacesegregation.nonsegregated;

public class Person extends Entity {
    String name;

    public Person(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
