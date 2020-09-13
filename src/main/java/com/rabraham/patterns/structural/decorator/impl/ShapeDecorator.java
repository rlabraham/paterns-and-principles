package com.rabraham.patterns.structural.decorator.impl;

import com.rabraham.patterns.structural.decorator.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
