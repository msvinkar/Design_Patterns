package com.milindvinkar.solid.interfacesegregation.nonsegregated;

public class OrderStorageService implements StorageService<Order> {
    @Override
    public void save(Order entity) {
        // saves order to db
    }

    @Override
    public void remove(Order entity) {
        //removes order from DB
    }

    @Override
    public Order getById(long id) {
        return new Order(1);
    }

    // At this moment the Storage service knew that it fucked up !
    // this is where pollution happened
    // so to solve this : we will remove this method from StorageService and add it to some another interface.
    @Override
    public String getName(long id) {
        throw new UnsupportedOperationException("An order does not have a name");
    }
}
