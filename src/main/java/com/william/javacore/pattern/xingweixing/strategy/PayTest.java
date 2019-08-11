package com.william.javacore.pattern.xingweixing.strategy;

import com.william.javacore.pattern.xingweixing.strategy.paytype.PayType;

public class PayTest {

	
	public static void main(String[] args) {
		
		// 选购商品，加入购物车，点击订单支付
		 Order order = new Order("1","2018120381489799722801",69.50);
		 /**
		  * 各种支付方式，支付算法已经提前封装好了，用户不需要关心算法的实现
		  * 只需要做出适当的选择即可。
		  */
		 System.out.println(order.pay(PayType.ALI_PAY));
	}
}
