package com.william.javacore.thread.future;

import java.util.concurrent.*;

/**
 * @author chaizheng chaizheng@3vjia.com
 * @since 2021-01-23 15:08
 */
public class FutureTest {


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

        FutureTask future = new FutureTask<Integer>(callable);
        new Thread(future).start();
        try {
            System.out.println("----res="+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
