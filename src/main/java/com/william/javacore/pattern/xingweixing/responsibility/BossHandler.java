package com.william.javacore.pattern.xingweixing.responsibility;

/**
 * @author williamdream
 * @since 2021-01-25 17:28
 */
public class BossHandler extends Handler{


    public BossHandler(String leaderName, String leaderLevel) {
        super(leaderName, leaderLevel);
    }

    @Override
    public void process(EmployeeRequest employeeRequest) {
        if(employeeRequest.getDays()>7&&employeeRequest.getDays()<10){
            System.out.println(this.getLeaderLevel()+"-"+this.getLeaderName()+"：员工"+employeeRequest.getEmployeeName()+"请假："+employeeRequest.getDays()+"天，请假天数大于7天，批准请假！");
        }else {
            System.out.println(this.getLeaderName()+"：员工"+employeeRequest.getEmployeeName()+"请假："+employeeRequest.getDays()+"天，莫非你小子不想干了！！！");
        }
    }
}
