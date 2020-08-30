package com.rabraham.patterns.creational.builder.impl;

import com.rabraham.patterns.creational.builder.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
