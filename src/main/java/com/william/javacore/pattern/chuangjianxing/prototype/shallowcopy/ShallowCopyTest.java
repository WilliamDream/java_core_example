package com.william.javacore.pattern.chuangjianxing.prototype.shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyTest {

	
	public static void main(String[] args) {
		OldBean bean = new OldBean();
		bean.setName("乔丹");
		bean.setAge(45);
		bean.setGender(true);
		List<String> list = new ArrayList();
		list.add("六个NBA总冠军");
		bean.setList(list);
		System.out.println(bean.getName());
		System.out.println(list);
		
		System.out.println("-----------拷贝后-------------");
		OldBean newbean = (OldBean)bean.clone();
		newbean.setName("科比");
		list = new ArrayList();
		list.add("五个NBA总冠军");
		bean.setList(list);
		System.out.println(newbean.getName());
		System.out.println(newbean.getList());
		
		
	}
	
}
