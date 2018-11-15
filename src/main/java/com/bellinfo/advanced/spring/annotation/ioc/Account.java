package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Account {
    @Autowired
    Transaction transaction;

    @Override
    public String toString() {
        return "Account{" +
                "transaction=" + transaction +
                '}';
    }
}
