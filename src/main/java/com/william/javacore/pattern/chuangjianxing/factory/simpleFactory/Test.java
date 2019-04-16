package com.william.javacore.pattern.chuangjianxing.factory.simpleFactory;

import com.william.javacore.pattern.factory.Car;

/**
 * 
 * 简单工厂模式测试
 *
 */
public class Test {

	public static void main(String[] args) {
		
		SimpleCarFactory factory = new SimpleCarFactory();
		Car car = factory.getCar("奥迪");
		System.out.println(car.getCar());
	}
}
