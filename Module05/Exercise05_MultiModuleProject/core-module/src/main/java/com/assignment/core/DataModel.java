package com.assignment.core;

public class DataModel {
    private int id;
    private String name;

    public DataModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DataModel[id=" + id + ", name=" + name + "]";
    }
}
