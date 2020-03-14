package com.william.javacore.pattern.xingweixing.template.v1;

public class TemplateTest {


    public static void main(String[] args) {
        System.out.println("===坐动车===");
        Dtrian dongche = new Dtrian();
        dongche.byTrain();
        System.out.println("===坐高铁===");
        Gtrain gaotie = new Gtrain();
        gaotie.byTrain();


    }

}
