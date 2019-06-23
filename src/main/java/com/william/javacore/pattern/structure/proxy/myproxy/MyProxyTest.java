package com.william.javacore.pattern.structure.proxy.myproxy;

import com.william.javacore.pattern.structure.proxy.jdk.HouseProxy;
import com.william.javacore.pattern.structure.proxy.jdk.Person;
import com.william.javacore.pattern.structure.proxy.jdk.Renter;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 22:17
 */
public class MyProxyTest {

    public static void main(String[] args){

        try {
            Person person = new Renter();
            MyHouseProxy houseProxy = new MyHouseProxy();
            Person p = (Person)houseProxy.getInstance(person);
            p.findHouse();
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
