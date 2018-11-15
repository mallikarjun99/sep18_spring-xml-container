package com.bellinfo.advanced.spring.annotation.ioc;

public class Customer {

    Address address;

    public Customer(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                '}';
    }
}
