package com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.abstractFactory;

import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Audi;
import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.BMW;
import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Benz;
import com.william.javacore.pattern.jiegouxing.chuangjianxing.factory.Car;

public class CarFactory extends AbstractCarFactory{

	@Override
	public Car getBenz() {
		return new Benz("奔驰");
	}

	@Override
	public Car getBMW() {
		return new BMW("宝马");
	}

	@Override
	public Car getAudi() {
		return new Audi("奥迪");
	}

	
	
	
}
