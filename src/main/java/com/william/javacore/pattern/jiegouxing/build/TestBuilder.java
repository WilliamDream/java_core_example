package com.william.javacore.pattern.jiegouxing.build;


public class TestBuilder {

    public static void main(String[] args) {
        Builder basicComputerBuilder = new BasicComputerBuilder();
        Computer basicComputer = new Director(basicComputerBuilder).builder();

    }
}
