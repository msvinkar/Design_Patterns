package com.milindvinkar.solid.interfacesegregation.segragated;

import com.milindvinkar.solid.interfacesegregation.nonsegregated.Order;

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
}
