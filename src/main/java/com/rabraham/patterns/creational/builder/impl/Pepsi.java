package com.rabraham.patterns.creational.builder.impl;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.50f;
    }
}
