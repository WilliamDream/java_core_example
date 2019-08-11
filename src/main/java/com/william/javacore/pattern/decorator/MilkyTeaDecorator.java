package com.william.javacore.pattern.decorator;

/**
 * @Author: WilliamDream
 * @Description: 抽象的装饰类
 * @Date: 2017/8/11 19:21
 */
public abstract class MilkyTeaDecorator extends MilkyTea{

    //这里类似静态代理对象
    private MilkyTea milkyTea;

    //有参的构造函数，将需要包装的对象传进来
    public MilkyTeaDecorator(MilkyTea milkyTea){
        this.milkyTea = milkyTea;
    }

    @Override
    protected String getTea() {
        return this.milkyTea.getTea();
    }

    @Override
    protected Integer getPrice() {
        return this.milkyTea.getPrice();
    }
}
