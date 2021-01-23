package com.william.javacore.pattern.jiegouxing.decorator;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/12/30 19:26
 */
public class PearlMilkyTeaDecorator extends MilkyTeaDecorator{

    public PearlMilkyTeaDecorator(MilkyTea milkyTea){
        super(milkyTea);
    }



    @Override
    protected String getTea() {
        return super.getTea() + "加珍珠";
    }

    @Override
    protected Integer getPrice() {
        return super.getPrice() + 1;
    }
}
