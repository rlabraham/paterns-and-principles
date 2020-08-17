package com.rabraham.patterns.behavioral.visitor.impl;

import com.rabraham.patterns.behavioral.visitor.ComputerPart;
import com.rabraham.patterns.behavioral.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
