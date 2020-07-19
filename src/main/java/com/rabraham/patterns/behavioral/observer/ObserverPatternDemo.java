package com.rabraham.patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverPatternDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        log.info("First state change: 15");
        subject.setState(15);
        log.info("Second state change: 10");
        subject.setState(10);
    }
}
