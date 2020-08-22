package com.rabraham.patterns.creational.factory.impl;

import com.rabraham.patterns.creational.factory.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("Inside Rectangle.draw()");
    }
}
