package com.william.javacore.pattern.jiegouxing.composite.safe;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 19:44
 * @Description:
 */
public class CompositeTest {

    public static void main(String[] args) {
        Composite boss = new Composite("总经理");
        Composite c1 = new Composite("研发部");
        Composite c2 = new Composite("运营部");
        Composite c3 = new Composite("销售部");

        boss.addChild(c1);
        boss.addChild(c2);
        boss.addChild(c3);

        Component l1 = new Leaf("后端组");
        Component l2 = new Leaf("前端组");
        Component l3 = new Leaf("产品组");

        c1.addChild(l1);
        c1.addChild(l2);
        c1.addChild(l3);

        boss.printStruct("");
    }

}
