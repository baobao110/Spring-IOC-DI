package com.java;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String[] arrays;

    private List<String >list;

    private Map<String,String> map;

    private Properties properties;


    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void test(){
        System.out.println("数组"+arrays);
        System.out.println("List"+list);
        System.out.println("Map"+map);
        System.out.println("Properties"+properties);
    }
}
//bean的复杂类型属性注入：数组 ，List,Map,Properties