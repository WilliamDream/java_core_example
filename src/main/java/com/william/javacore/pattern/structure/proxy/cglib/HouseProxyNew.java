package com.william.javacore.pattern.structure.proxy.cglib;

import java.lang.reflect.Method;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 16:18
 */
public class HouseProxyNew {

/*    public Object getProxy(Class<?> cla){
        Enhancer enhancer = new Enhancer();
        //设置目标类，子类增强父类
        enhancer.setSuperclass(cla);
        //设置回调接口对象，callback也就是当前对象this
        enhancer.setCallback(this);
        //创建代理对象,也就是目标类的子类对象
        return enhancer.create();
    }

    *//**
     * 拦截目标类的调用
     *//*
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("前置代理");
        Object object = method.invoke(obj, args);
        System.out.println("后置代理");
        return object;
    }*/


}
