package com.rabraham.patterns.behavioral.visitor.impl;

import com.rabraham.patterns.behavioral.visitor.ComputerPart;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
