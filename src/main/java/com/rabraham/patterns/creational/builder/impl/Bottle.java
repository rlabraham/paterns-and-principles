package com.rabraham.patterns.creational.builder.impl;

import com.rabraham.patterns.creational.builder.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
