package com.william.javacore.pattern.xingweixing.responsibility;

/**
 * @author chaizheng chaizheng@3vjia.com
 * @since 2021-01-26 09:34
 */
public class EmployeeRequest {

    private String employeeName;

    private Integer days;

    private String reason;

    public EmployeeRequest(String employeeName, Integer days, String reason) {
        this.employeeName = employeeName;
        this.days = days;
        this.reason = reason;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
