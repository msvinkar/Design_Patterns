package com.milindvinkar.patterns.prototype;

public class Prototype implements Cloneable {

    int id;
    Object datasource;
    Object networkAdapter;
    Object sparkClusterSimulator;
    State shallowObj;
    NonClonableObject nonClonableObject;

    public Prototype() {
        initialize();
    }

    private void initialize() {
        try {
            datasource = "datasource";
            Thread.sleep(100);      // dummy cost for creating a datasource
            networkAdapter = "networkAdapter";
            Thread.sleep(100);      // dummy cost for creating a network adapter
            sparkClusterSimulator = "sparkClusterSimulator";
            Thread.sleep(100);      // dummy cost for creating a sparkClusterSimulator
            shallowObj = new State(1);
            nonClonableObject = new NonClonableObject();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "id=" + id +
                ", datasource=" + datasource +
                ", networkAdapter=" + networkAdapter +
                ", sparkClusterSimulator=" + sparkClusterSimulator +
                ", shallowObj=" + shallowObj +
                ", nonClonableObject=" + nonClonableObject +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        clone.nonClonableObject = (NonClonableObject) clone.nonClonableObject.clone();  // this will fail
        return clone;
    }
}
