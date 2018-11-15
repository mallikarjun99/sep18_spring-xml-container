package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Laptop {

    @Value("${hp.name}")
    String name;

    @Value("${hp.cost}")
    double cost;

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
