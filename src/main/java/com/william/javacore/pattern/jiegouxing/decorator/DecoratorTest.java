package com.william.javacore.pattern.jiegouxing.decorator;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2017/12/30 19:32
 */
public class DecoratorTest {
    public static void main(String[] args) {
        MilkyTea milkyTea = new CommonMilkTea();

        System.out.println("名字："+milkyTea.getTea()+"---价格："+milkyTea.getPrice());

        milkyTea = new PearlMilkyTeaDecorator(milkyTea);

        System.out.println("名字："+milkyTea.getTea()+"---价格："+milkyTea.getPrice());

        milkyTea = new MangoMilkyTeaDecorator(milkyTea);

        System.out.println("名字："+milkyTea.getTea()+"---价格："+milkyTea.getPrice());

        //总结：被装饰对象装饰完后还是那个对象，没有变，满足is-a关系，例如不管怎么装饰依然是奶茶
        //      跟静态代理不同的是，静态代理是增强功能的，装饰者更多的是扩展，职责不同。
    }

}
