package com.test.entity;

public enum Status {
    RUNNING("跑步"),STUDY("学习"),SLEEP("睡觉");

    private final String name;
    Status(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
