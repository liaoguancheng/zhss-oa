package com.zhss.oa.auth.model;

/**
 * 授权实体类
 */

public class Authorization {
    private long lsiao ;
    private Long id;
    private Long employeeId;
    private Long roleId;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getId() {

        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Long getRoleId() {
        return roleId;
    }
}
