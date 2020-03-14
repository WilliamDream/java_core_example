package com.william.javacore.pattern.jiegouxing.adapter.v2;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 21:18
 * @Description: 注意：在适配器模式中该接口可有可无
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    String login(String id ,Object adapter);

}
