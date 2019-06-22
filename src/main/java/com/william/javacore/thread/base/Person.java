package com.william.javacore.thread.base;

public abstract class Person {

	
	
	private String work;
	
	
	
	
	
	public Person(String work) {
		super();
		this.work = work;
	}

	public abstract String getPersonName();
	
	public String getPersonWork() {
		return this.work;
	}
	
	
	
}
