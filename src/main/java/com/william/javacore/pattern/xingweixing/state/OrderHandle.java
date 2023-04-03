package com.william.javacore.pattern.xingweixing.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OrderHandle {
    private Map<Enum<OrderStatus>,Order> orderMap = new ConcurrentHashMap<Enum<OrderStatus>,Order>();

    public OrderHandle(){
        orderMap.put(OrderStatus.WAIT_PAY,new WaitPay());
        orderMap.put(OrderStatus.WAIT_DELIVER,new Deliver());
        orderMap.put(OrderStatus.WAIT_RECEIVE,new Receive());
        orderMap.put(OrderStatus.REFUND,new Refund());
    }


    public String waitPay(Integer orderId, Enum<OrderStatus> status) {
        return orderMap.get(status).waitPay(orderId,status);
    }

    public String payOrder(Integer orderId, Enum<OrderStatus> status) {
        return orderMap.get(status).payOrder(orderId,status);
    }

    public String deliver(Integer orderId, Enum<OrderStatus> status) {
        return orderMap.get(status).deliver(orderId,status);
    }

    public String receive(Integer orderId, Enum<OrderStatus> status) {
        return orderMap.get(status).receive(orderId,status);
    }

    public String refund(Integer orderId, Enum<OrderStatus> status) {
        return orderMap.get(status).refund(orderId,status);
    }

}
