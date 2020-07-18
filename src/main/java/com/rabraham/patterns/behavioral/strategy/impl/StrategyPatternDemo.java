package com.rabraham.patterns.behavioral.strategy.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyPatternDemo {
    public static void main(String[] args) {
        final Context adderContext = new Context(new OperationAdd());
        log.info("10 + 5 = " + adderContext.executeStrategy(10, 5));

        final Context subtractionContext = new Context(new OperationSubtract());
        log.info("7 - 3 = " + subtractionContext.executeStrategy(7, 3));

        final Context multiplicationContext = new Context(new OperationMultiply());
        log.info("14 * 9 = " + multiplicationContext.executeStrategy(14, 9));
    }
}
