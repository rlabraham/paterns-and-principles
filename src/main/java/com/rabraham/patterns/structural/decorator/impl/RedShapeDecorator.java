package com.rabraham.patterns.structural.decorator.impl;

import com.rabraham.patterns.structural.decorator.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        log.info("Border Color: Red");
    }
}
