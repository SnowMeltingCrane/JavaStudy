package com.test.entity;

public class Test {
    private final String name;

    public Test(String name) {
        this.name = name;
    }

    public class Inner{

        public String name;

        public void test(String name){
            System.out.println("方法的名字："+name);
            System.out.println("内部类的名字："+this.name);
            System.out.println("外部类的名字："+Test.this.name);
        }
    }
}
