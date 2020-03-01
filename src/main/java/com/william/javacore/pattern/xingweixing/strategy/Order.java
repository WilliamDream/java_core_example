package com.william.javacore.pattern.xingweixing.strategy;

import com.william.javacore.pattern.xingweixing.strategy.paytype.PayType;

public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

<<<<<<< HEAD:src/main/java/com/william/javacore/pattern/xingweixing/strategy/Order.java
    //payType这个参数，完全可以用Payment这个接口来代替
    //那么需要将Payment作为一个成员变量，然后在有参构造函数中对Payment进行复制
=======


>>>>>>> 059660e4a46b3c683c1eb3108a53627309bc9b2b:src/main/java/com/william/javacore/pattern/xingweixing/strategy/Order.java
    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }

}
