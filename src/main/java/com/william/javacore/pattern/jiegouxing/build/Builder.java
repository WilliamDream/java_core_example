package com.william.javacore.pattern.jiegouxing.build;


public abstract class Builder {

    protected Computer computer = new Computer();

    public void buildMemory(){

    }

    public void buildCpu(){

    }

    public void buildDisk(){

    }

    public Computer builder(){
        return computer;
    }

}
