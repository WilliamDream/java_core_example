package com.william.javacore.pattern.decorator;

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
