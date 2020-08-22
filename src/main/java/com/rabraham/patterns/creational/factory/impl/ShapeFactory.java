package com.rabraham.patterns.creational.factory.impl;

import com.rabraham.patterns.creational.factory.Shape;
import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){

        if (StringUtils.isNotEmpty(shapeType)) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();

            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();

            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square();
            }
        }

        return null;
    }
}
