package com.william.javacore.java.introspection;

/**
 * @Auther: williamdream
 * @Date: 2018/5/30 21:17
 * @Description:
 */
public class User {

    private Integer userid;

    private String username;

    private Integer gender;


    public User() {
    }

    public User(Integer userid, String username, Integer gender) {
        this.userid = userid;
        this.username = username;
        this.gender = gender;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}
