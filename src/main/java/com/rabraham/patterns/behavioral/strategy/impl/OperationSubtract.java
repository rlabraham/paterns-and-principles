package com.rabraham.patterns.behavioral.strategy.impl;

import com.rabraham.patterns.behavioral.strategy.Strategy;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
