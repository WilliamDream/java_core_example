package com.william.javacore.pattern.xingweixing.template.v1;


public class Dtrian extends AbstractTrain {

    private boolean needPickUpTicket = true;

    public void setNeedPickUpTicket(boolean needPickUpTicket) {
        this.needPickUpTicket = needPickUpTicket;
    }

    @Override
    protected boolean needPickUpTicket() {
        System.out.println("子类2");
        return this.needPickUpTicket;
    }

    @Override
    public void pickUpTicket() {
        System.out.println("2、使用身份证取票");
    }
}
