package com.william.javacore.java.introspection;

import java.beans.*;

/**
 * @Auther: chaiz
 * @Date: 2018/5/30 21:21
 * @Description: Introspection内省测试
 */
public class IntrospectionTest {

    public static void main(String[] args) {

        User user = new User(1,"William",1);
        try {
            PropertyDescriptor pd = new PropertyDescriptor("username",User.class);
            System.out.println("id："+pd.getReadMethod().invoke(user));
            System.out.println("名字：" + pd.getReadMethod().invoke(user));
            pd.getWriteMethod().invoke(user,"Kobe");
            System.out.println("修改后的名字：" + pd.getReadMethod().invoke(user));


            System.out.println("*************************************");


            BeanInfo beanInfo = Introspector.getBeanInfo(User.class,Object.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                System.out.println("属性名："+property.getName());
                System.out.println(property.getReadMethod());
                System.out.println(property.getWriteMethod());

            }


            System.out.println("======================================");


            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
            for (MethodDescriptor method : methodDescriptors) {
                System.out.println("方法名："+method.getName());
                System.out.println(method.getMethod());
            }



        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

    }


}
