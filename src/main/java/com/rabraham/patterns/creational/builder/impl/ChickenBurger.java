package com.rabraham.patterns.creational.builder.impl;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 5.99f;
    }
}
