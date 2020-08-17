package com.rabraham.patterns.behavioral.visitor.impl;

import com.rabraham.patterns.behavioral.visitor.ComputerPartVisitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        log.info("Displaying computer");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("Displaying mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("Displaying keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("Displaying monitor");
    }
}
