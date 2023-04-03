package com.william.javacore.pattern.xingweixing.state;

public abstract class Order {

    protected OrderHandle context;

    public void setContext(OrderHandle context) {
        this.context = context;
    }

    //订单已创建待支付
    public abstract String waitPay(Integer orderId,Enum<OrderStatus> status);

    //支付订单
    public abstract String payOrder(Integer orderId,Enum<OrderStatus> status);

    //订单支付完成发货
    public abstract String deliver(Integer orderId,Enum<OrderStatus> status);

    //收货
    public abstract String receive(Integer orderId,Enum<OrderStatus> status);

    //支付完成申请退款
    public abstract String refund(Integer orderId,Enum<OrderStatus> status);

}
