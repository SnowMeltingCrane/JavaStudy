package com.test.entity;

public class Test {
    static {
        System.out.println("外部");
    }
    static String name = "小明";

    public static class Inner{
        static {
            System.out.println("内部");
        }
        public static void test() {
            System.out.println("内部类的静态方法");
        }
    }
}
