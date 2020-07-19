package com.rabraham.patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Binary String: {}", Integer.toBinaryString(subject.getState()));
    }
}
