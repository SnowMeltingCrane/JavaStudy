package com.test.entity;

public class Worker extends Person{
    String name;

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void work() {
        System.out.println("我是"+super.name+",我在工作");
    }

    @Override
    public void test() {
        System.out.println("我是工人");
    }

    public void exam(){
        System.out.println("我是工人，我不擅长考试");
    }
}
