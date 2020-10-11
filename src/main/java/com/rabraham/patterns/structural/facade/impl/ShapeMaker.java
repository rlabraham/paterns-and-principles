package com.rabraham.patterns.structural.facade.impl;

import com.rabraham.patterns.structural.facade.Shape;

public class ShapeMaker {
    private Shape circle = new Circle();
    private Shape rectangle = new Rectangle();
    private Shape square = new Square();

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
