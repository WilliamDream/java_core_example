package com.william.javacore.pattern.chuangjianxing.factory.factoryMethod;

import com.william.javacore.pattern.chuangjianxing.factory.Benz;
import com.william.javacore.pattern.chuangjianxing.factory.Car;

public class BenzFactory implements CarFactory{

	public Car getCar() {
		return new Benz("奔驰");
	}

}
