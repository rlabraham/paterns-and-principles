package com.rabraham.patterns.creational.builder.impl;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.99f;
    }
}
