package com.rabraham.patterns.structural.facade.impl;

public class FacadePatternDemo {
    public static void main(String[] args) {
        final ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
