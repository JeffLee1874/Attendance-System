package com.example.atSys.entity;

import java.util.Set;

public class user {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;

    public user(String s, String wsl, String s1, Set<Role> roleSet) {
        this.id = s;
        this.userName = wsl;
        this.password = s1;
        this.roles = roleSet;
    }
    //省略set、get方法等.....


    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}