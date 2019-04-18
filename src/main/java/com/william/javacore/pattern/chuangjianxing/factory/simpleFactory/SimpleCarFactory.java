package com.william.javacore.pattern.chuangjianxing.factory.simpleFactory;

import com.william.javacore.pattern.chuangjianxing.factory.Audi;
import com.william.javacore.pattern.chuangjianxing.factory.BMW;
import com.william.javacore.pattern.chuangjianxing.factory.Benz;
import com.william.javacore.pattern.chuangjianxing.factory.Car;

public class SimpleCarFactory {

	
	public Car getCar(String name) {
		if ("奔驰".equals(name)) {
			return new Benz(name);
		}else if ("宝马".equals(name)) {
			return new BMW(name);
		}else if ("奥迪".equals(name)) {
			return new Audi(name);
		}else {
			return null;
		}
		
	}
	
}
