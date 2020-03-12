package com.william.javacore.pattern.jiegouxing.proxy.jdk;

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

            Person obj = (Person)new HouseProxy().getInstance(new Renter());
            System.out.println(obj.getClass());
            obj.findHouse();

            //把动态代理生成的对象写入磁盘文件
            byte [] bytes = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("D://$proxy0.class");
            os.write(bytes);
            os.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
