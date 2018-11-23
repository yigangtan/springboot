package com.baizhi.entity;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private Date birthyday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthyday=" + birthyday +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthyday() {
        return birthyday;
    }

    public void setBirthyday(Date birthyday) {
        this.birthyday = birthyday;
    }

    public User(int id, String username, String password, Date birthyday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthyday = birthyday;
    }

    public User() {
    }
}
