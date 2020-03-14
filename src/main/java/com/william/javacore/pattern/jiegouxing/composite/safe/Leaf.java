package com.william.javacore.pattern.jiegouxing.composite.safe;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 19:43
 * @Description:
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + this.name);
    }
}
