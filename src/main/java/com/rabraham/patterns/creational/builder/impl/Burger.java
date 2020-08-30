package com.rabraham.patterns.creational.builder.impl;

import com.rabraham.patterns.creational.builder.Item;
import com.rabraham.patterns.creational.builder.Packing;

public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
