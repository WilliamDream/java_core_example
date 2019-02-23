package com.william.javacore.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {

	private Map<String,IEmployee> workmap = new HashMap<String,IEmployee>();
	
	public Leader() {
		workmap.put("招聘",new Employee_HR());
		workmap.put("销售",new Employee_Salesman());
	}
	
	public void hardwork(String work) {
		IEmployee employee = workmap.get(work);
		if(employee!=null) {
			employee.hardwork(work);
		}else {
			System.out.println("没有该岗位");
		}
	}

}
