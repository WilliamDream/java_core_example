package com.william.javacore.pattern.xingweixing.strategy.traffic;


import com.william.javacore.pattern.xingweixing.strategy.ResultVo;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2018/4/9 21:45
 */
public abstract class Traffic {
    public abstract String getWay();



    public ResultVo way(String way, int juli){
        return new ResultVo(way,juli);
    }


}
