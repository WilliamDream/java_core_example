package com.william.javacore.pattern.jiegouxing.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 19:30
 * @Description:
 */
public class Composite implements Component{

    //存储组合对象包含的子组件对象
    private List<Component> componentList = new ArrayList<Component>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public List<Component> getChild(){
        return this.componentList;
    }

    public void addChild(Component component){
        componentList.add(component);
    }

    public void removeChild(int index){
        componentList.remove(index);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);
        if(this.componentList != null){
            preStr += "  ";
            for (Component component : componentList){
                component.printStruct(preStr);
            }
        }
    }
}
