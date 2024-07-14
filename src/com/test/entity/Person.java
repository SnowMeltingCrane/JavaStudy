package com.test.entity;

public class Person {
    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(obj instanceof Person){
            Person person = (Person)obj;
            return this.name.equals(person.name) &&
                    this.age == person.age&&
                    this.sex.equals(person.sex);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void test(){

    }
}
