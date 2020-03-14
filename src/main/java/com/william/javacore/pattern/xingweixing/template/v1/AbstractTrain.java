package com.william.javacore.pattern.xingweixing.template.v1;


public abstract class AbstractTrain {



    public void byTrain(){

        buyTicketOnline();

        if(needPickUpTicket()){
            pickUpTicket();
        }

        checkTicket();

        getOnTrain();

    }

    //钩子方法，是否需要取票
    protected boolean needPickUpTicket(){
        System.out.println("父类");
        return true;
    }

    //网上买票
    public void buyTicketOnline(){
        System.out.println("1、网上买票");
    }

    //取票 交给子类去实现
    public abstract void pickUpTicket();

    //检票
    protected void checkTicket(){
        System.out.println("3、检票");
    }

    //上车
    public void getOnTrain(){
        System.out.println("4、进站上车");
    }

}
