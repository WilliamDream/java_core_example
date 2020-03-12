package com.william.javacore.pattern.jiegouxing.proxy.myproxy;
import com.william.javacore.pattern.jiegouxing.proxy.jdk.Person;
import java.lang.reflect.*;

/**
   * @Description 通过MyProxy类生成的代理类
   * @Date 2017/6/23 9:47
   */
public class $Proxy0 implements Person{
    private MyInvocationHandler h;
    public $Proxy0(MyInvocationHandler h) {
        this.h = h;
    }
    public void findHouse(){
        try{
            Method m = Person.class.getMethod("findHouse",new Class[]{});
            this.h.invoke(this,m,null);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }
}