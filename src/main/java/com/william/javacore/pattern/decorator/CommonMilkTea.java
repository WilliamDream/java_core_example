package com.william.javacore.pattern.decorator;


/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/12/30 19:21
 */
public class CommonMilkTea extends MilkyTea{

	@Override
	protected String getTea() {
		return "普通原味奶茶";
	}

	@Override
	protected Integer getPrice() {
		return 10;
	}

}
