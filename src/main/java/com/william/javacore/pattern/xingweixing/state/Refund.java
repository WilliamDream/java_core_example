package com.william.javacore.pattern.xingweixing.state;


public class Refund extends Order {


    @Override
    public String waitPay(Integer orderId, Enum<OrderStatus> status) {
        return "订单已支付";
    }

    @Override
    public String payOrder(Integer orderId, Enum<OrderStatus> status) {
        return "订单已支付";
    }

    @Override
    public String deliver(Integer orderId, Enum<OrderStatus> status) {
        return "订单已支付";
    }

    @Override
    public String receive(Integer orderId, Enum<OrderStatus> status) {
        return "订单已支付";
    }

    @Override
    public String refund(Integer orderId, Enum<OrderStatus> status) {
        OrderService.changeStatus(orderId,status,OrderStatus.REFUND);
        return "订单申请退款";
    }
}
