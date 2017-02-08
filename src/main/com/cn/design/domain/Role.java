package com.cn.design.domain;

import java.util.List;

/**
 * Created by lijunhong on 17/2/8.
 */
public class Role {

    private Integer roleId;     //角色id

    private int userType;       //0为普通用户,1为管理员用户

    private List<User> users;   //用户

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
