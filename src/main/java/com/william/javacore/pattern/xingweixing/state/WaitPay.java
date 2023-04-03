package com.william.javacore.pattern.xingweixing.state;

public class WaitPay extends Order{


    @Override
    public String waitPay(Integer orderId, Enum<OrderStatus> status) {
        OrderService.changeStatus(orderId,status,OrderStatus.PAY_SUCCESS);
        return "订单支付成功";
    }

    @Override
    public String payOrder(Integer orderId, Enum<OrderStatus> status) {
        return "订单等待支付";
    }

    @Override
    public String deliver(Integer orderId, Enum<OrderStatus> status) {
        return "订单等待支付";
    }

    @Override
    public String receive(Integer orderId, Enum<OrderStatus> status) {
        return "订单等待支付";
    }

    @Override
    public String refund(Integer orderId, Enum<OrderStatus> status) {
        return "订单等待支付";
    }
}
