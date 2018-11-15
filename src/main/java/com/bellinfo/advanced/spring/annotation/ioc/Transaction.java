package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

    int trnid = 20;

    @Override
    public String toString() {
        return "Transaction{" +
                "trnid=" + trnid +
                '}';
    }
}
