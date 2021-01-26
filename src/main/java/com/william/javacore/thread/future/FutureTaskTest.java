package com.william.javacore.thread.future;

import java.util.concurrent.*;

/**
 * @author chaizheng chaizheng@3vjia.com
 * @since 2021-01-23 16:12
 */
public class FutureTaskTest {

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int sum=0;
            for (int i = 0; i < 10; i++) {
                sum+=i;
            }
            return sum;
        }
    });

    //获取Future的第二种方式
    Future<Integer> submit = executorService.submit(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            int sum=0;
            for (int i = 0; i < 10; i++) {
                sum+=i;
            }
            return sum;
        }
    });


//    System.out.println("在这里随便做什么事");
//
//    System.out.println(integerFutureTask.get());
//    //效果和上面相同只不过设定的最长等待时间为2s  TimeUnit用来设置时间单位
//    System.out.println(integerFutureTask.get(2,TimeUnit.SECONDS));

}
