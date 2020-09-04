package com.milindvinkar.solid.interfacesegregation.nonsegregated;

public interface StorageService<T extends Entity> {

    void save(T entity);

    void remove(T entity);

    T getById(long id);

    String getName(long id);

}
