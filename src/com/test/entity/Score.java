package com.test.entity;

public class Score<T extends Number> {
    String name;
    String id;
    T value;

    public Score(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
