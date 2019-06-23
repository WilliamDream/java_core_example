package com.william.javacore.pattern.structure.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 16:01
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        try{
            Person person = new Renter();
            HouseProxy houseProxy = new HouseProxy();
            Person p = (Person)houseProxy.getInstance(person);
            p.findHouse();


            byte [] bytes = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("D://$proxy0.class");
            os.write(bytes);
            os.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
