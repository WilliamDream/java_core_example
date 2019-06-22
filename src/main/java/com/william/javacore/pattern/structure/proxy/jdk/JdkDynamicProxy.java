package com.william.javacore.pattern.structure.proxy.jdk;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/22 16:01
 */
public class JdkDynamicProxy {

    public static void main(String[] args) {
        try{
            Person person = (Person) new HouseProxy().getInstance(new Renter());
            person.findHouse();
        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
