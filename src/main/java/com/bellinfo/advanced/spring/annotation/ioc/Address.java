package com.bellinfo.advanced.spring.annotation.ioc;

public class Address {

    int hno = 123;
    String street = "Ashburn";

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", street='" + street + '\'' +
                '}';
    }
}
