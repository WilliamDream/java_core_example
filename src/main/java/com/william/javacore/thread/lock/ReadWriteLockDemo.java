package com.william.javacore.thread.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

	static Map<String, Object> cacheMap = new HashMap<String, Object>();
	
	static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	static Lock read = readWriteLock.readLock();
	
	static Lock write = readWriteLock.writeLock();
	
	
	/* 读-读 线程不阻塞
	 * 读/写锁 线程阻塞
	 * 读写锁在读多写少的场景下，提示系统并发性能
	 */
	public static final Object get(String key) {
		read.lock();
		try {
			return cacheMap.get(key);
		} finally {
			read.unlock();
		} 
		
	}
	
	
	public static final Object set(String key,Object value) {
		read.lock();
		try {
			return cacheMap.put(key,value);
		} finally {
			read.unlock();
		} 
		
	}
	
}
