package com.william.javacore.pattern.jiegouxing.adapter.v2;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 21:15
 * @Description:
 */
public class SignService {

    public String regist(String username,String password){
        String res = "注册成功,用户名" + username;
        System.out.println(res);
        return res;

    }


    public String login(String username,String password){
        return "登录成功";
    }

}
