package com.william.javacore.pattern.factory.factoryMethod;

import com.william.javacore.pattern.factory.Car;

public class Test {

	public static void main(String[] args) {
		
		CarFactory factory = new BenzFactory();
		Car car = factory.getCar();
		System.out.println(car);
		
	}
	
}
