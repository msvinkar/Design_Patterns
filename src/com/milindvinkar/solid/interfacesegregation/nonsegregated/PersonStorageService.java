package com.milindvinkar.solid.interfacesegregation.nonsegregated;

public class PersonStorageService implements StorageService<Person> {
    @Override
    public void save(Person entity) {
        // saves to DB
    }

    @Override
    public void remove(Person entity) {
        //removes from DB
    }

    @Override
    public Person getById(long id) {
        //retrieves from DB
        return new Person(1, "xs");
    }

    @Override
    public String getName(long id) {
        Person p = getById(id);
        return p.getName();

    }
}
