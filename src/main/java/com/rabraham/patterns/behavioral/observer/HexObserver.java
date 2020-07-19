package com.rabraham.patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Hex String: {}", Integer.toHexString(subject.getState()).toUpperCase());
    }
}
