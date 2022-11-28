package com.example.boot_training.mapper;

import com.example.boot_training.dto.EmployeeDto;
import com.example.boot_training.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDtoMapper {

    public Employee convertFromEmployeeDto(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getName(), employeeDto.getSalary(), employeeDto.getAge());
    }

    public EmployeeDto convertEmployeeToDto(Employee employee) {
        return new EmployeeDto(employee.getName(), employee.getAge(), employee.getSalary());
    }
}
