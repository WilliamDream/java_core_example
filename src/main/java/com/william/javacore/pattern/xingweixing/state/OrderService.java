package com.william.javacore.pattern.xingweixing.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OrderService {

    private static Map<Integer,Enum<OrderStatus>> orderMap = new ConcurrentHashMap<Integer,Enum<OrderStatus>>();

    public static void initOrder(Integer orderId,Enum<OrderStatus> status){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setUserId(1001);
        orderInfo.setStatus(status);
        orderMap.put(orderInfo.getOrderId(),status);
    }

    public static synchronized void changeStatus(Integer orderId, Enum<OrderStatus> beforeStatus,
                                               Enum<OrderStatus> afterStatus) {
        if (!beforeStatus.equals(orderMap.get(orderId)))
            return;
        orderMap.put(orderId, afterStatus);
    }
}
