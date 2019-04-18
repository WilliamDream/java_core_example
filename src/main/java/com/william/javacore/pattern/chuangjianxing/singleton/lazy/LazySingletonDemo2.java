package com.william.javacore.pattern.chuangjianxing.singleton.lazy;

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
