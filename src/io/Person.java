package io;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + "," + id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
