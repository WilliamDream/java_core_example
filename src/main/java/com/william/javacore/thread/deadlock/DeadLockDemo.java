package com.william.javacore.thread.deadlock;

/**
 * @Auther: chaiz
 * @Date: 2019/8/27 14:03
 * @Description:
 */
public class DeadLockDemo {

        private static Object lockA = new Object();
        private static Object lockB = new Object();

        private static void startThreadA() {
            Thread aThread = new Thread() {
                @Override
                public void run() {
                    synchronized(lockA) {
                        System.out.println("线程1持有了A的锁");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (lockB) {
                            System.out.println("线程1竞争B的锁");
                        }
                    }
                }
            };
            aThread.start();
        }

        private static void startThreadB() {
            Thread bThread = new Thread() {
                @Override
                public void run() {
                    synchronized(lockB) {
                        System.out.println("线程2持有了B的锁");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (lockA) {
                            System.out.println("线程2竞争A的锁");
                        }
                    }
                }
            };
            bThread.start();
        }

        public static void main(String[] args) {
            startThreadA();
            startThreadB();
        }



}
