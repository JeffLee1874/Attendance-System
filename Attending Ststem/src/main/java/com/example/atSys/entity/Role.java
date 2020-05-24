package com.example.atSys.entity;

import java.util.Set;

public class Role {

    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permission> permissions;

    public Role(String s, String admin, Set<Permission> permissionsSet) {
        this.id = s;
        this.permissions = permissionsSet;
        this.roleName = admin;
    }
    //省略set、get方法等.....


    public String getId() {
        return id;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
