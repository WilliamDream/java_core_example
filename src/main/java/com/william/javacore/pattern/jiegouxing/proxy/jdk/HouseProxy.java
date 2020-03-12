package com.william.javacore.pattern.jiegouxing.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 15:50
 */
public class HouseProxy implements InvocationHandler {

    //保存被代理对象的引用
    private Object target;

    public Object getInstance(Person object) throws Exception {
        this.target = object;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.doBefore();
        method.invoke(this.target,args);
        this.doAfter();
        return null;
    }

    private void doBefore(){
        System.out.println("我是房产中介，我们有很多房源。");
    }

    private void doAfter(){
        System.out.println("我带你去看房吧！");
    }

}
