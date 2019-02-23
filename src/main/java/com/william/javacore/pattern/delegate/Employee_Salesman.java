package com.william.javacore.pattern.delegate;

public class Employee_Salesman implements IEmployee{

	public void hardwork(String work) {
		System.out.println("我是销售，我负责销售产品");
	}

}
