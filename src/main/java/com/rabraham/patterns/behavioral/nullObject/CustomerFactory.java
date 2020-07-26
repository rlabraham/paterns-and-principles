package com.rabraham.patterns.behavioral.nullObject;

import org.apache.commons.lang3.StringUtils;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(final String customerName){
        for (String name : names) {
            if (StringUtils.equalsIgnoreCase(name, customerName)) {
                return new RealCustomer(customerName);
            }
        }

        return new NullCustomer();
    }
}
