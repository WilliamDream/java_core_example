package com.william.javacore.pattern.jiegouxing.adapter.v2;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 21:24
 * @Description:
 */
public class LoginForWechatAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public String login(String id, Object adapter) {
        return null;
    }
}
