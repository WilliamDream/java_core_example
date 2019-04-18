package com.william.javacore.pattern.chuangjianxing.singleton.lazy;

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
