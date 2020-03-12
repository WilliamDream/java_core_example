package com.william.javacore.pattern.xingweixing.strategy.paytype;

import com.william.javacore.pattern.xingweixing.strategy.PayState;

public interface Payment {

	PayState pay(String uid, double amount);
}
