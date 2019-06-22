package com.william.javacore.thread.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderExecutorThread {

	public static void main(String[] args) {
/*		Thread thread1 = new Thread(() -> System.out.println("run thread1"),"thread1");
	    Thread thread2 = new Thread(() -> System.out.println("run thread2"),"thread2");
	    Thread thread3 = new Thread(() -> System.out.println("run thread3"),"thread3");
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    executor.execute(thread1);
	    executor.execute(thread2);
	    executor.execute(thread3);
	    executor.shutdown();
	    
	    
	    Thread thread4 = new Thread(() -> {
            System.out.println("run thread4");
            // 这里延时是为了验证thread5是否在等待thread4运行结束
            try { Thread.sleep(500); }catch (Exception e){}
        },"thread4");
        Thread thread5 = new Thread(() -> {
            try {
                // 等线程 thread4 调用结束后继续
                thread4.join();
            }catch (InterruptedException e){}
            System.out.println("run thread5");
        },"thread5");
        Thread thread6 = new Thread(() -> {
            try {
                thread5.join();
            }catch (InterruptedException e){}
            System.out.println("run thread6");
        },"thread6");

        thread4.start();
        thread5.start();
        thread6.start();*/
	    
	}
	
	
}
