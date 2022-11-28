package com.example.boot_training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@NonNull
public class EmployeeDto {
    private String name;
    private int salary;
    private int age;

    public EmployeeDto(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
