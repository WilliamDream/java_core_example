package com.william.javacore.collections;

import java.util.HashMap;

public class WithoutHashcode {

	public static void main(String[] args) {
		HashCodeAndEquals k1 = new HashCodeAndEquals(1);
		HashCodeAndEquals k2 = new HashCodeAndEquals(1);
		HashMap<HashCodeAndEquals,String> hm = new HashMap<HashCodeAndEquals,String>();
		hm.put(k1, "Key with id is 1"); 
		System.out.println(hm.get(k2)); 
	}
	
}
