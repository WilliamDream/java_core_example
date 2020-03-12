package com.william.javacore.pattern.jiegouxing.adapter.v1;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 20:30
 * @Description:
 */
public class AndroidDataLineImpl implements AndroidDataLine{


    @Override
    public void connect() {
        System.out.println("给安卓手机充电");
    }
}
