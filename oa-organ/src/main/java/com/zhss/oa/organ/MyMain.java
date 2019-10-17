package com.zhss.oa.organ;

import com.zhss.oa.organ.model.Employee;
import com.zhss.oa.organ.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-organ.xml");
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        Employee employee = new Employee();
        employee.setAge(13);
        employee.setName("zhangsan");
        employeeService.addEmployee(employee);

    }
}
