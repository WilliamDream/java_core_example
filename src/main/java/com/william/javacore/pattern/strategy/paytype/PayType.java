package com.william.javacore.pattern.strategy.paytype;

public enum PayType {

	ALI_PAY(new AliPay()),
    JD_PAY(new JDPay());

    private Payment payment;
    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get(){ return  this.payment;}
	
}
