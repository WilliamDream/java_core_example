package com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.factoryMethod;

import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Car;

/**
 * 
 * 工厂方法测试
 *
 */
public class Test {

	public static void main(String[] args) {
		
		CarFactory factory = new BenzFactory();
		Car car = factory.getCar();
		System.out.println(car);
		
	}
	
}
