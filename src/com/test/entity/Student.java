package com.test.entity;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;

    transient public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void hello(){
        System.out.println("我是学生");
    }
}
