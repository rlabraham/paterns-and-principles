package com.rabraham.patterns.behavioral.nullObject;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(final String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
