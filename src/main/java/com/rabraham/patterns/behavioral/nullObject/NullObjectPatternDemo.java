package com.rabraham.patterns.behavioral.nullObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NullObjectPatternDemo {
    public static void main(String[] args) {

        final AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        final AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        final AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        final AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
        
        log.info("Customers");
        log.info(customer1.getName());
        log.info(customer2.getName());
        log.info(customer3.getName());
        log.info(customer4.getName());
    }
}
