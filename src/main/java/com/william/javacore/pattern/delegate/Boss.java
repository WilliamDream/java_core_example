package com.william.javacore.pattern.delegate;

public class Boss {

	
	public static void main(String[] args) {
		//委派模式：就是静态代理和策略模式一种特殊的组合
		//委派者要持有被委派者的引用
		//委派的核心：就是分发、调度、派遣
		Leader leader = new Leader();
		leader.hardwork("招聘");
		
	}
}
