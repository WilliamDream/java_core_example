package com.william.javacore.pattern.chuangjianxing.singleton.holder;


/**
 * Holder模式实现单例，既希望利用饿汉模式中静态变量的方便和线程安全；又希望通过懒加载规避资源浪费。
 * 
 *
 */
public class EffectiveSingletonDemo {

	private EffectiveSingletonDemo() {}
	
	/**
	 * 内部类
	 *
	 */
	private static class SingletonHolder {
		private static final EffectiveSingletonDemo instance = new EffectiveSingletonDemo();
		private SingletonHolder() {}
	}
	
	public static final EffectiveSingletonDemo getInstance() {
		return SingletonHolder.instance;
	}
	
}
