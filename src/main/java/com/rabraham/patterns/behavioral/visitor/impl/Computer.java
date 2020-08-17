package com.rabraham.patterns.behavioral.visitor.impl;

import com.rabraham.patterns.behavioral.visitor.ComputerPart;
import com.rabraham.patterns.behavioral.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
