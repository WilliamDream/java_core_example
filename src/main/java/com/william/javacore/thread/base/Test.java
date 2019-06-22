package com.william.javacore.thread.base;

public class Test {

	public static void main(String[] args) {
		
		a();
		b();
		
		
	}
	
	public static void a() {
		b();
		System.out.println("111");
	}
	
	public static void b() {
		a();
		System.out.println("222");
	}
}
