package com.zhss.oa.organ.service.Impl;

import com.zhss.oa.organ.mapper.EmployeeMapper;
import com.zhss.oa.organ.model.Employee;
import com.zhss.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public void addEmployee(Employee employee) {

         employeeMapper.addEmployee(employee);
    }

    public Employee findById(Long id) {
        return employeeMapper.findById(id);
    }
}
