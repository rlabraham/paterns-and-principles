package com.rabraham.patterns.behavioral.visitor;

import com.rabraham.patterns.behavioral.visitor.impl.Computer;
import com.rabraham.patterns.behavioral.visitor.impl.Keyboard;
import com.rabraham.patterns.behavioral.visitor.impl.Monitor;
import com.rabraham.patterns.behavioral.visitor.impl.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}


