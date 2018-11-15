package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Qualifier(value = "department")
    @Autowired
    Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
