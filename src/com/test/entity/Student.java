package com.test.entity;

import java.io.Serializable;

public class Student extends Person implements Study,Cloneable{

    private Status status;

    public Student(String name, int age,String sex){
        super(name,age,sex);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void study(){
        System.out.println("我学习比较佛系");
    }

    @Override
    public void test() {
        System.out.println("我是学生");
    }

    public void exam(){
        System.out.println("我是学生，我擅长考试");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
