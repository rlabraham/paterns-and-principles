package com.rabraham.patterns.creational.builder.impl;

import com.rabraham.patterns.creational.builder.Item;
import com.rabraham.patterns.creational.builder.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
