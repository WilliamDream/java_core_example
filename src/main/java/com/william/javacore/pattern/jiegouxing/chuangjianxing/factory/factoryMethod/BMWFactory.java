package com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.factoryMethod;

import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Benz;
import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Car;

public class BMWFactory implements CarFactory{

	public Car getCar() {
		return new Benz("宝马");
	}
}
