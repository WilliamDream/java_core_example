package com.william.javacore.pattern.chuangjianxing.factory.factoryMethod;

import com.william.javacore.pattern.factory.Benz;
import com.william.javacore.pattern.factory.Car;

public class AudiFacotry  implements CarFactory{

	public Car getCar() {
		return new Benz("奥迪");
	}

}
