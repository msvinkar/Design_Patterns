package com.milindvinkar.solid.interfacesegregation.segragated;

import com.milindvinkar.solid.interfacesegregation.nonsegregated.Entity;

public interface StorageService<T extends Entity> {

    void save(T entity);

    void remove(T entity);

    T getById(long id);

}
