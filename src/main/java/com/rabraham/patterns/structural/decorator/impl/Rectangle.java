package com.rabraham.patterns.structural.decorator.impl;

import com.rabraham.patterns.structural.decorator.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
      log.info("Draw: Rectangle");
    }
}
