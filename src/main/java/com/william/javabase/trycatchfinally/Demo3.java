package com.william.javabase.trycatchfinally;

public class Demo3 {

	/**
	 * 字节码指令如下：


	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(getString());
		System.out.println("---------------------");
		System.out.println(getString2());
		
	}
	
	
	public static String getString() {
		String str = "hello";
		try {
			int a = 1/0;
			return str;
		} catch (Exception e) {
			System.out.println("执行catch");
			return "error";
		}finally {
			return str = "hi";
		}
	}
	
	public static String getString2() {
		String str = "hello";
		try {
			int a = 1/0;
			return str;
		} catch (Exception e) {
			System.out.println("执行catch");
			return "error";
		}finally {
			str = "hi";
		}
	}
	
	
}
