package com.william.javacore.java.introspection;

import java.util.Date;
import java.util.List;

/**
 * @Auther: chaiz
 * @Date: 2018/5/30 21:26
 * @Description:
 */
public class Student extends Person{

    private Integer studId;

    private String stuName;

    private Date birthday;

    private List<String> hobby;

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
