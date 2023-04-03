package com.william.javacore.pattern.xingweixing.state;

public class Receive extends Order{


    @Override
    public String waitPay(Integer orderId, Enum<OrderStatus> status) {
        return "订单已发货";
    }

    @Override
    public String payOrder(Integer orderId, Enum<OrderStatus> status) {
        return "订单已发货";
    }

    @Override
    public String deliver(Integer orderId, Enum<OrderStatus> status) {
        OrderService.changeStatus(orderId,status,OrderStatus.FINISH);
        return "订单已签收,完成订单";
    }

    @Override
    public String receive(Integer orderId, Enum<OrderStatus> status) {
        return "订单已发货";
    }

    @Override
    public String refund(Integer orderId, Enum<OrderStatus> status) {
        return "订单已发货";
    }
}
