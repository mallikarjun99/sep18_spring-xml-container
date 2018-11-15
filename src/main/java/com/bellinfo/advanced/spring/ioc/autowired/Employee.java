package com.bellinfo.advanced.spring.ioc.autowired;

public class Employee {
    Department department;

    public Employee(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
