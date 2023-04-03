package com.william.javacore.pattern.xingweixing.state;

public class Test {
    public static void main(String[] args) {
        Integer orderId = 10901601;
        OrderService.initOrder(orderId,OrderStatus.CREATE_ORDER);
        OrderHandle orderHandle = new OrderHandle();
        String result = orderHandle.payOrder(orderId,OrderStatus.RECEIVE);
        System.out.println(result);

    }
}
