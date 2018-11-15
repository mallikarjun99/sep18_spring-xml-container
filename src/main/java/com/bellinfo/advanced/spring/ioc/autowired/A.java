package com.bellinfo.advanced.spring.ioc.autowired;

public class A {
    B bob;

    public void setBob(B bob) {
        this.bob = bob;
    }

    @Override
    public String toString() {
        return "A{" +
                "bob=" + bob +
                '}';
    }
}
