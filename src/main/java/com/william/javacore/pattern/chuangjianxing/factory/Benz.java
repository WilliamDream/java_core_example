package com.william.javacore.pattern.chuangjianxing.factory;

public class Benz implements Car{

	private String name;
	
	
	public Benz(String name) {
		this.name = name;
	}


	public Car getCar() {
		return new Benz("奔驰");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
