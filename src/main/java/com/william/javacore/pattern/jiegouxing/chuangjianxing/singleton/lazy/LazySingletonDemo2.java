package com.william.javacore.pattern.jiegouxing.chuangjianxing.singleton.lazy;

/**
 * 饱汉式变种2
 * 外层加入check，内层又有synchronized锁，就是又名的DCL(Double Check Lock)
 * DCL线程不安全，可能会得到半个对象
 */
public class LazySingletonDemo2 {

	private static LazySingletonDemo2 singleton = null;
	
	private LazySingletonDemo2() {
		
	}
	
	public static LazySingletonDemo2 getInstance() {
		// may get half object
		if (singleton == null) {
			synchronized (LazySingletonDemo2.class) {
		        if (singleton == null) {
		        	singleton = new LazySingletonDemo2();
		        }
	        }
	    }
	    return singleton;
	}
	
}
