package com.william.javacore.pattern.jiegouxing.adapter.v1;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 20:31
 * @Description:
 */
public class IosDataLineImpl implements IosDataLine{


    @Override
    public void connect() {
        System.out.println("给苹果手机充电");
    }


}
