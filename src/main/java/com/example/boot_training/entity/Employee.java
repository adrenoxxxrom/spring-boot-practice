package com.example.boot_training.entity;

import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
public class Employee {
    private int id;
    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
