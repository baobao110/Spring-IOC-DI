package com.java;

//通过xml的bean配置方法注入对象类型的属性
public class UserService {

    //1 定义dao类型的属性,注意这里的对象变量，对应xml中property中的name
    private UserDao user;

    //2 生成set方法
    public void setUser(UserDao user) {
        this.user = user;
    }

    public void add(){
        System.out.println("Service+++++++++++++");
        user.add();
    }
}
