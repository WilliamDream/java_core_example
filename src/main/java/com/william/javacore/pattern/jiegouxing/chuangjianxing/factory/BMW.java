package com.william.javacore.pattern.jiegouxing.chuangjianxing.factory;

public class BMW implements Car{

	private String name;
	
	
	public BMW(String name) {
		this.name = name;
	}


	public Car getCar() {
		return new BMW("宝马");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
