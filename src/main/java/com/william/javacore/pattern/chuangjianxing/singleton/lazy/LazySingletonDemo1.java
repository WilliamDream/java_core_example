package com.william.javacore.pattern.chuangjianxing.singleton.lazy;

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
