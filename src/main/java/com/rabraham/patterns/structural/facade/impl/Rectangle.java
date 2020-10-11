package com.rabraham.patterns.structural.facade.impl;

import com.rabraham.patterns.structural.facade.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("Calling rectangle.draw");
    }
}
