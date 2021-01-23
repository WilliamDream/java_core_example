package com.william.javacore.thread.sync;

/**
 * @author WilliamDream
 */
public class SynchronizedDemo1 {

    public Integer y = 0;
    public Integer x = new Integer(1);
    public Integer z = 200;
    public Integer k = 100;

    //1.对象锁 实例方法
    public synchronized void objectLock(){
        int count = 5;
        for(int i=0;i<5;i++){
            count--;
            System.out.println(Thread.currentThread().getName()+"-----count:"+count);

        }
    }

    //2.对象锁 代码块
    public void objectLock1(){
        synchronized (this){
            int count = 5;
            for(int i=0;i<5;i++){
                count--;
                System.out.println(Thread.currentThread().getName()+"-----count:"+count);

            }
        }
    }

    //3.类锁 代码块
    public void classLock(){
        synchronized (SynchronizedDemo1.class){
            int count = 5;
            for(int i=0;i<5;i++){
                count--;
                System.out.println(Thread.currentThread().getName()+"-----count:"+count);

            }
        }
    }

    //4.类锁 静态方法
    public static synchronized void classLock1(){
        int count = 5;
        for(int i=0;i<5;i++){
            count--;
            System.out.println(Thread.currentThread().getName()+"-----count:"+count);

        }
    }


    public void testSynchronized(){
//        synchronized (SynchronizedDemo1.class) { //能，类锁就是全局锁，会锁住所有的类对象
//        synchronized (this) { //不能，当前对象的实例锁，只能锁住当前对象
//        synchronized (x) {  //不能，两个不同的SynchronizedDemo1类对象拥有的x是不一样，可以进入 1 在常量池，x在堆中，一个指针或者句柄指向常量池1的地址
//        synchronized (z) {  //不能 //-128-127 之间，还是同一个对象，否则会Intger创建一个新对象
        synchronized (k) { //能，x 此时在常量池，常量池是线程共享的
            for (int i = 1; i <= 5; i++) {
                setNumber();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i + "  --->>> " + getNumber());
            }
        }
    }

    public void setNumber() {
        y++;
    }

    public int getNumber() {
        return y;
    }


    public static void main(String[] args) {
        //测试对象锁，首先需要获取对象锁，一个线程获取了对象锁，其他线程只能等待锁释放后
        //无论是调用objectLock方法还是objectLock1方法，效果一样
        /*final SynchronizedDemo1 synchronizedDemo1 = new SynchronizedDemo1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo1.classLock();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo1.objectLock1();
            }
        });

        thread1.start();
        thread2.start();*/


        //两个不同的对象
        final SynchronizedDemo1 synchronizedDemo1 = new SynchronizedDemo1();
        final SynchronizedDemo1 synchronizedDemo2 = new SynchronizedDemo1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo1.testSynchronized();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo2.testSynchronized();
            }
        });

        thread1.start();
        thread2.start();

    }


}
