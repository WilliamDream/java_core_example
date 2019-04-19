package com.william.javacore.pattern.chuangjianxing.singleton.lazy;


/**
 * 饱汉式
 * 使用synchronized锁保证线程安全
 *
 */
public class LazySingletonDemo1 {

	private static LazySingletonDemo1 singleton = null;
	private LazySingletonDemo1() {
		
	}
	public synchronized static LazySingletonDemo1 getInstance() {
		if (singleton == null) {
	    	singleton = new LazySingletonDemo1();
	    }
	    return singleton;
	}
	
	
}
