package com.william.javacore.pattern.xingweixing.strategy;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2018/8/9 21:47
 */
public class ResultVo {

    private String way;

    private int juli;


    public ResultVo(String way, int juli) {
        this.way = way;
        this.juli = juli;
    }

    @Override
    public String toString() {
        return "交通方式："  + way + ", 距离：" + juli ;
    }
}
