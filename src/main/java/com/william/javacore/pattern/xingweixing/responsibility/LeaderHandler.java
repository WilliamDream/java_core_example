package com.william.javacore.pattern.xingweixing.responsibility;

/**
 * @author williamdream
 * @since 2021-01-25 17:26
 */

public class LeaderHandler extends Handler{


    public LeaderHandler(String leaderName, String leaderLevel) {
        super(leaderName, leaderLevel);
    }

    @Override
    public void process(EmployeeRequest employeeRequest) {
        if(employeeRequest.getDays()<=3){
            System.out.println(this.getLeaderLevel()+"-"+this.getLeaderName()+"：员工"+employeeRequest.getEmployeeName()+"请假："+employeeRequest.getDays()+"天，请假天数小于3天，批准请假！");
        }else{
            if(this.getNextHandler()!=null){
                System.out.println("员工"+employeeRequest.getEmployeeName()+"请假天数大于3天，交给"+this.getNextHandler().getLeaderLevel()+"导处理。");
                this.getNextHandler().process(employeeRequest);
            }
        }
    }
}
