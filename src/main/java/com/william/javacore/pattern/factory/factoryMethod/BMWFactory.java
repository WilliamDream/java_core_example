package com.william.javacore.pattern.factory.factoryMethod;

import com.william.javacore.pattern.factory.Benz;
import com.william.javacore.pattern.factory.Car;

public class BMWFactory implements CarFactory{

	public Car getCar() {
		return new Benz("宝马");
	}
}
