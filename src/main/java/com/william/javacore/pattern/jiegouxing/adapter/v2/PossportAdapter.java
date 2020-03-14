package com.william.javacore.pattern.jiegouxing.adapter.v2;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 21:14
 * @Description:
 */
public class PossportAdapter extends SignService implements IPossportForThird{

    @Override
    public String LoginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public String loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }


    private String processLogin(String key ,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
