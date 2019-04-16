package com.william.javacore.pattern.chuangjianxing.factory.factoryMethod;

import com.william.javacore.pattern.factory.Benz;
import com.william.javacore.pattern.factory.Car;

public class BenzFactory implements CarFactory{

	public Car getCar() {
		return new Benz("奔驰");
	}

}
