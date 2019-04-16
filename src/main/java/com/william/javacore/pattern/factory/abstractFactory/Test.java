package com.william.javacore.pattern.factory.abstractFactory;

import com.william.javacore.pattern.factory.Car;


/**
 * 
 * 抽象工厂测试
 *
 */
public class Test {

	
	public static void main(String[] args) {
		//抽象工厂对于用户来说只有选择对应的方法即可，变得更简单了，抽象工厂是Spring中常用的设计模式之一
		CarFactory factory = new CarFactory();
		Car car = factory.getBenz();
		System.err.println(car);
	}
	
}
