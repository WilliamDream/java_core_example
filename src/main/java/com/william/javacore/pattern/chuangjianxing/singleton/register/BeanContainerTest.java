package com.william.javacore.pattern.chuangjianxing.singleton.register;

import java.util.concurrent.CountDownLatch;

import com.william.javacore.pattern.chuangjianxing.singleton.lazy.LazySingletonDemo1;

public class BeanContainerTest {
	public static void main(String[] args) {

        int count = 200;

        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count;i ++) {
            new Thread(){
                @Override
                public void run() {
                    try{

                        try {
                            // 阻塞
                            latch.await();
                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        //必然会调用，可能会有很多线程同时去访问getInstance()
                        Object obj = BeanContainer.getBean("com.william.javacore.pattern.chuangjianxing.singleton.register.Bean");;
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                        System.out.println("----------------------------");
                        Object obj1 = LazySingletonDemo1.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj1);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();

            //每次启动一个线程，count --
            latch.countDown();

        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));


    }
	
}
