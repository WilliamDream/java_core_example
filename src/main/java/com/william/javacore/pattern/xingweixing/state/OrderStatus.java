package com.william.javacore.pattern.xingweixing.state;

public enum OrderStatus {
    /**
     * 创建订单----待支付
     * 支付订单----待发货
     * 发货   ----待签收
     * 签收   ----完成
     * 退款   ----退款
     */
    CREATE_ORDER,WAIT_PAY,PAY_SUCCESS,WAIT_DELIVER,DELIVER,WAIT_RECEIVE,RECEIVE,FINISH,REFUND
}
