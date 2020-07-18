package com.rabraham.patterns.behavioral.strategy.impl;

import com.rabraham.patterns.behavioral.strategy.Strategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Context {
    private Strategy strategy;

    public int executeStrategy(int num1, int num2) {
       return strategy.doOperation(num1, num2);
    }
}
