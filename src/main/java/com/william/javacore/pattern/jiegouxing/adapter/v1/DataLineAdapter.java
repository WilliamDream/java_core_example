package com.william.javacore.pattern.jiegouxing.adapter.v1;

/**
 * @Auther: williamdream
 * @Date: 2019/3/16 20:35
 * @Description: 假设场景，我们需要用Android数据线给IOS手机充电，那么我们需要一个转换头
 * 输入的是Android口，输出的是IOS口，需要我们实现Android数据线接口，静态注入IOS数据线。
 */
public class DataLineAdapter implements AndroidDataLine {

    private IosDataLine iosDataLine;

    public DataLineAdapter(IosDataLine iosDataLine) {
        this.iosDataLine = iosDataLine;
    }

    @Override
    public void connect() {
        iosDataLine.connect();
    }

}
