package com.example.boot_training.dao;

import com.example.boot_training.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private Integer idCount = 0;
    private final Map<Integer, Employee> employeeDaoMap = new HashMap<>();

    public void createEmployee(Employee employee) {
        idCount++;
        employeeDaoMap.put(idCount, employee);
        employee.setId(idCount);
    }

    public Employee getEmployee(Integer id) {
        return employeeDaoMap.get(id);
    }

    public Employee updateEmployee(Integer id, Employee emp) {
        Employee employee = employeeDaoMap.get(id);
        employee.setName(employee.getName());
        employee.setAge(employee.getAge());
        employee.setSalary(employee.getSalary());
        return employee;
    }

    public void deleteEmployee(Integer id) {
        employeeDaoMap.remove(id);
    }
}
