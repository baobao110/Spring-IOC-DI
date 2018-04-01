package com.java;

public class User {

    String name;

//    注意xml文件的参数的有参数构造注入的方法
    public User(String name){
        this.name=name;
    }

    public void test(){
        System.out.println("---------"+name);
    }
}
