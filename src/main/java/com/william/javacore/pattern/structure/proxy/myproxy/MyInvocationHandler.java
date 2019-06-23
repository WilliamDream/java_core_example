package com.william.javacore.pattern.structure.proxy.myproxy;

import java.lang.reflect.Method;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/6/22 21:58
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
