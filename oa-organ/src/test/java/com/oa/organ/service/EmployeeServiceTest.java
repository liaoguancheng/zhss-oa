package com.oa.organ.service;


import com.zhss.oa.organ.model.Employee;
import com.zhss.oa.organ.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:application-organ.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testAddEmployee(){
        Employee employee = new Employee();
        employee.setAge(13);
        employee.setName("zhangsan");
        employeeService.addEmployee(employee);
    }
}
