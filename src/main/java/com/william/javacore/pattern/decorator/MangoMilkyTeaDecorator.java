package com.william.javacore.pattern.decorator;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/12/30 19:28
 */
public class MangoMilkyTeaDecorator extends MilkyTeaDecorator{

    public MangoMilkyTeaDecorator(MilkyTea milkyTea){
        super(milkyTea);
    }

    @Override
    protected String getTea() {
        return super.getTea() + "加芒果";
    }

    @Override
    protected Integer getPrice() {
        return super.getPrice() + 1;
    }
}
