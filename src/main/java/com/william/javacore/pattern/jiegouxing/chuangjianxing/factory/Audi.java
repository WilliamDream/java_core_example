package com.william.javacore.pattern.jiegouxing.chuangjianxing.factory;

public class Audi implements Car{

	private String name;
	
	
	public Audi(String name) {
		this.name = name;
	}


	public Car getCar() {
		return new Audi("奥迪");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
