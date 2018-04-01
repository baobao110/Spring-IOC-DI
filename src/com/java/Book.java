package com.java;

public class Book {

    String name;

    //xml属性注入的set方法
    public void setName(String name) {
        this.name = name;
    }

    public void Name(){
        System.out.println("=============="+name);
    }
}
