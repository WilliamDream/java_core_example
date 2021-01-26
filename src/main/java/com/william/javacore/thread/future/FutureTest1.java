package com.william.javacore.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author chaizheng chaizheng@3vjia.com
 * @since 2021-01-23 16:05
 */
public class FutureTest1 {


    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int a =0;
                for(int i=0;i<10000;i++){
                    a = a +i;
                    Thread.sleep(10);
                }
                return a;
            }
        };

        ExecutorService executorRef = Executors.newCachedThreadPool();
        Future future = executorRef.submit(callable);
        try {
            System.out.println( "-- "+ future.get()+"---" + future.isDone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorRef.shutdown();
    }
}
