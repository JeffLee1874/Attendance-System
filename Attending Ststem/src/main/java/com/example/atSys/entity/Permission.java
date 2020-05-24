package com.example.atSys.entity;

public class Permission {
    private String id;
    private String permissionsName;
    //省略set、get方法等.....

    public Permission(String s, String query) {
        this.id = s;
        this.permissionsName = query;
    }

    public String getId() {
        return id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }
}