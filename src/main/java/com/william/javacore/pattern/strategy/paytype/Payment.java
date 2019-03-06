package com.william.javacore.pattern.strategy.paytype;

import com.william.javacore.pattern.strategy.PayState;

public interface Payment {

	public PayState pay(String uid, double amount);
}
