package com.william.javacore.pattern.jiegouxing.adapter.v2;

/**
 * @Auther: williamdream
 * @Date: 2019/3/14 21:19
 * @Description:
 */
public class LoginForQQAdapter implements LoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public String login(String id, Object adapter) {
        return null;
    }
}
