package com.william.javacore.pattern.chuangjianxing.singleton.lazy;


/**
 * 饱汉式变种3
 * 在饱汉式变种2中加入了volatile来保证线程安全性
 *
 */
public class LazySingletonDemo3 {

	private static volatile LazySingletonDemo3 singleton = null;
	private LazySingletonDemo3() {
		
	}
	
	public static LazySingletonDemo3 getInstance() {
	    if (singleton == null) {
	    	synchronized (LazySingletonDemo3.class) {
		        // must be a complete instance
		        if (singleton == null) {
		          singleton = new LazySingletonDemo3();
		        }
	        }
	    }
	    return singleton;
	}
	
}
