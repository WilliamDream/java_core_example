package com.william.javabase.trycatchfinally;

public class Demo3 {

	/**
	 * 字节码指令如下：


	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("-----------getString----------");
//		System.out.println(getString());	//运行结果，编译期报错，缺少返回语句
		System.out.println("------------getString1---------");
		System.out.println(getString1());
		System.out.println("------------getString2---------");
		System.out.println(getString2());
		
	}
	/*public static String getString() {
		String str = "hello";
		try {
			int a = 1/0;
			return str;
		} catch (Exception e) {
			System.out.println("执行catch");
			str =  "catch修改为：error";
		}finally {
			System.out.println("执行finally");
			str = "finally修改为：hi";
		}
	}*/
	
	public static String getString1() {
		String str = "hello";
		try {
			int a = 1/0;
			return str;
		} catch (Exception e) {
			System.out.println("执行catch");
			return "error";
		}finally {
			System.out.println("执行finally");
			str = "hi";
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
			System.out.println("执行finally");
			return str = "hi";
		}
	}
	
	
}
