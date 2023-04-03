package com.william.javacore.pattern.jiegouxing.build;


public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public Computer builder(){
        builder.buildMemory();
        builder.buildCpu();
        builder.buildDisk();
        return builder.builder();
    }
}
