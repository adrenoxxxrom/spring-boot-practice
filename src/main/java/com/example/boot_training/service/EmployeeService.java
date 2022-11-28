package com.example.boot_training.service;

import com.example.boot_training.dao.EmployeeDao;
import com.example.boot_training.dto.EmployeeDto;
import com.example.boot_training.entity.Employee;
import com.example.boot_training.mapper.EmployeeDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    private final EmployeeDao employeeDao;
    private final EmployeeDtoMapper employeeDtoMapper;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao, EmployeeDtoMapper employeeDtoMapper) {
        this.employeeDao = employeeDao;
        this.employeeDtoMapper = employeeDtoMapper;
    }

    public void createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeDtoMapper.convertFromEmployeeDto(employeeDto);
        employeeDao.createEmployee(employee);
    }

    public EmployeeDto getEmployee(Integer id) {
        Employee employee = employeeDao.getEmployee(id);
        return employeeDtoMapper.convertEmployeeToDto(employee);
    }

    public Employee updateEmployee(Integer id, EmployeeDto employeeDto) {
        Employee employee = employeeDtoMapper.convertFromEmployeeDto(employeeDto);
        return employeeDao.updateEmployee(id, employee);
    }

    public void deleteEmployee(Integer id) {
        employeeDao.deleteEmployee(id);

    }
}
