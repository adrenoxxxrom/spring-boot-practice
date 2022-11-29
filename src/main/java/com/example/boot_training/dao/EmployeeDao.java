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
        if (!employeeDaoMap.containsKey(id)) {
            return null;
        }
        return employeeDaoMap.get(id);
    }

    public void updateEmployee(Integer id, Employee emp) {
        Employee employee = employeeDaoMap.get(id);
        employee.setName(emp.getName());
        employee.setAge(emp.getAge());
        employee.setSalary(emp.getSalary());
    }

    public void deleteEmployee(Integer id) {
        employeeDaoMap.remove(id);
    }
}
