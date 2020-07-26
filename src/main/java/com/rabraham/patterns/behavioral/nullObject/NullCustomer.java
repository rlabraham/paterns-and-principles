package com.rabraham.patterns.behavioral.nullObject;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not available in customer database";
    }
}
