package com.william.javacore.jvm.classload;

public class Demo1 {

	
	static {
		i = 1;
//		System.out.println(i);
	}
	
	private static int i = 0;
	
	public static void main(String[] args) {
		
		/**
		 * 问题1：为什么这段代码没有通过编译？
		 * 
		 * 执行i = 1时会在方法去中分配内存空间，此时还不知内存地址，打印i时需要加载i在内存中的地址，所以第8行报错。
		 * 
		 * 问题2：为什么第7行通过了编译？
		 * 
		 * 因为第11行编译后i已经在方法变量表中存在，即声明过了，所以第7行可以找到i
		 * 
		 */
	}
}
