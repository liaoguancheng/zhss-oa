package com.zhss.oa.flow.model;

public class Application {

    private Long id;
    private Long employeeId;
    private Integer days;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Long getId() {

        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Integer getDays() {
        System.out.println(1);
        return days;
    }
}
