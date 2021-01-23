package com.william.javacore.pattern.xingweixing.template.v1;


public class Gtrain extends AbstractTrain{

    private boolean needPickUpTicket = false;

    public void setNeedPickUpTicket(boolean needPickUpTicket) {
        this.needPickUpTicket = needPickUpTicket;
    }

    @Override
    protected boolean needPickUpTicket() {
        return this.needPickUpTicket;
    }

    @Override
    public void pickUpTicket() {
        System.out.println("2、不需要取票");
    }
}
