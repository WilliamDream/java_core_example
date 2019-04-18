package com.william.javacore.pattern.chuangjianxing.singleton.hungry;

/**
 * 饿汉式
 * 它是在类加载的时候就立即初始化，并且创建单例对象
 *
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好
 * 缺点：类加载的时候就初始化,可能造成资源浪费。
 * 
 */
public class HungrySingletonDemo {

	private HungrySingletonDemo() {}
	
	private static final HungrySingletonDemo instance = new HungrySingletonDemo();
	
	public static HungrySingletonDemo getInstance() {
		return instance;
	}
	
}
