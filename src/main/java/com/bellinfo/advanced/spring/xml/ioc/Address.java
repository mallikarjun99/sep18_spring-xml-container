package com.bellinfo.advanced.spring.xml.ioc;

public class Address {
    int hno;
    String street;
    String city;

    public Address(int hno, String street, String city) {
        this.hno = hno;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
