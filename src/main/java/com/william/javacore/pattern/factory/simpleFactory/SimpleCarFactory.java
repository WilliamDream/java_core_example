package com.william.javacore.pattern.factory.simpleFactory;

import com.william.javacore.pattern.factory.Audi;
import com.william.javacore.pattern.factory.BMW;
import com.william.javacore.pattern.factory.Benz;
import com.william.javacore.pattern.factory.Car;

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
