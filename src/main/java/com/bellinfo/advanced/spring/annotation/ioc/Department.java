package com.bellinfo.advanced.spring.annotation.ioc;

public class Department {

    int depid;
    String depname;

    public Department(int depid, String depname) {
        this.depid = depid;
        this.depname = depname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depid=" + depid +
                ", depname='" + depname + '\'' +
                '}';
    }
}
