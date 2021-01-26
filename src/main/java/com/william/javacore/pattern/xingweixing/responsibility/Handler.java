package com.william.javacore.pattern.xingweixing.responsibility;

/**
 * @author williamdream
 * @since 2021-01-25 17:13
 */
public abstract class Handler {

    private String leaderName;

    private String leaderLevel;

    //责任链中下一个元素
    private Handler nextHandler;

    //抽象方法，由责任链中的元素节点实现
    public abstract void process(EmployeeRequest employeeRequest);

    //设置责任链中下一个元素节点
    public Handler setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public Handler(String leaderName, String leaderLevel) {
        this.leaderName = leaderName;
        this.leaderLevel = leaderLevel;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderLevel() {
        return leaderLevel;
    }

    public void setLeaderLevel(String leaderLevel) {
        this.leaderLevel = leaderLevel;
    }
}
