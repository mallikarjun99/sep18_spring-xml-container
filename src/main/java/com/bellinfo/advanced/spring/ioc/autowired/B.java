package com.bellinfo.advanced.spring.ioc.autowired;

public class B {
    int b=20;

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                '}';
    }
}
