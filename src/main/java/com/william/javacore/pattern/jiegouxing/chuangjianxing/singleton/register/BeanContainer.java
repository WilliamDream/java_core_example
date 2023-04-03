package com.william.javacore.pattern.jiegouxing.chuangjianxing.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanContainer {

	private BeanContainer() {}
	
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	
	public static Object getBean(String name) {
		if (ioc.containsKey(name)) {
			return ioc.get(name);
		}else {
			Object object = null;
			try {
				object = Class.forName(name).newInstance();
				ioc.put(name,object);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return object;
		}
	}
	
	
}
