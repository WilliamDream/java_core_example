package com.william.javacore.thread.base.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String>{

	public String call() throws Exception {
		for (int i = 0; i < 10; i++) {
			System.out.println("打印点东西..."+i);
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
        MyCallable mc = new MyCallable(); 		//实例化 callable
 
        FutureTask oneTask = new FutureTask(mc); //用FutureTask包裹
        Thread oneThread = new Thread(oneTask); //用Thread包裹
        oneThread.start();
        System.out.print(oneTask.get()); //获取返回值
    }
	
}
