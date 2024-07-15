package com.test.entity;

import java.io.Serializable;
import java.sql.SQLOutput;

public class Teacher extends Person implements Study{
    public Teacher(String name,int age,String sex){
        super(name,age,sex);
    }

    @Override
    public void exam() {
        System.out.println("我是老师我考满分");
    }


    @Override
    public void study() {
        System.out.println();
    }
}
