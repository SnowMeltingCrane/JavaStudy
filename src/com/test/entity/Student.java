package com.test.entity;

public class Student {

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age=  age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
