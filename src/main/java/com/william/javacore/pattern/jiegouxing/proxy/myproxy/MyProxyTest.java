package com.william.javacore.pattern.jiegouxing.proxy.myproxy;

import com.william.javacore.pattern.jiegouxing.proxy.jdk.Person;
import com.william.javacore.pattern.jiegouxing.proxy.jdk.Renter;

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

            //把动态代理生成的对象写入磁盘文件
           /* byte [] bytes = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("D://$proxy0.class");
            os.write(bytes);
            os.close();*/
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
