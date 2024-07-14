package com.test.entity;

public class Student extends Person {
    public Student(String name, int age,String sex){
        super(name,age,sex);
    }
    public void study(){
        System.out.println("我是学生，我叫："+name);
    }

    @Override
    public void test() {
        System.out.println("我是学生");
    }
}
