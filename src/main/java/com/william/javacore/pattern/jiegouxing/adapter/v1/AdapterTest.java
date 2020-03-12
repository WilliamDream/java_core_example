package com.william.javacore.pattern.jiegouxing.adapter.v1;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 20:45
 * @Description:
 */
public class AdapterTest {


    public static void main(String[] args) {
        //需要用Android数据线给苹果手机充电，就要有个转换器
        IosDataLine iosDataLine = new IosDataLineImpl();
        DataLineAdapter adapter = new DataLineAdapter(iosDataLine);
        adapter.connect();

    }
}
