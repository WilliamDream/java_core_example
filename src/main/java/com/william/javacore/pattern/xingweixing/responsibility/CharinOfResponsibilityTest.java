package com.william.javacore.pattern.xingweixing.responsibility;

/**
 * 责任链模式
 * @author chaizheng chaizheng@3vjia.com
 * @since 2021-01-25 18:12
 */
public class CharinOfResponsibilityTest {

    public static void main(String[] args) {
        //初始化责任链
        Handler handler = new LeaderHandler("李工","组长")
                .setNext(new ManagerHandler("老刘","部门经理")
                        .setNext(new BossHandler("张总","总经理")));


        handler.process(new EmployeeRequest("小王",5,"结婚"));

    }

}
