package com.rabraham.patterns.structural.facade.impl;

import com.rabraham.patterns.structural.facade.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {
    @Override
    public void draw() {
      log.info("Calling circle.draw");
    }
}
