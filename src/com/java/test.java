package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String [] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User u=(User)context.getBean("User");//注意这里的参数通过有参构造注入的方法在xml文件中配置
        u.test();
        Book book=(Book)context.getBean("book");//注意这里的参数通过set注入的方法在xml文件中配置
        book.Name();

        UserService service=(UserService) context.getBean("service");//bean注入对象属性
        service.add();

        Person person=(Person) context.getBean("person");
        person.test();//bean复杂类型属性注入

    }
}
//属性注入的三种方式：set方法，有参构造方法，接口，Spring 使用set和有参构造

//bean的复杂类型属性注入：数组 ，List,Map,Properties

/**
 * IOC和DI的区别：
 * 1 IOC：控制反转，将对象创建交给spring管理配置
 * 2 DI：依赖注入，给类里面的属性设置值
 *3 关系:依赖注入不能单独存在，是在控制反转的基础上完成操作，DI依赖于IOC
 * */