package com.william.javacore.pattern.jiegouxing.build;


public class BasicComputerBuilder extends Builder{

    @Override
    public void buildMemory() {
        System.out.println("低配电脑，8G内存");
        computer.setMemory("8G内存");
    }

    @Override
    public void buildCpu() {
        System.out.println("i5 CPU");
        computer.setCpu("i5 CPU");
    }

    @Override
    public void buildDisk() {
        System.out.println("128G固态硬盘");
        computer.setDisk("128G固态硬盘");
    }

}
