package com.william.javacore.pattern.xingweixing.state;

public class OrderInfo {

    private Integer orderId;

    private Integer userId;

    private Enum<OrderStatus> status;

    private Double totalMoney;

    private String date;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Enum<OrderStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<OrderStatus> status) {
        this.status = status;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
