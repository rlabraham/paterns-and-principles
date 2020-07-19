package com.rabraham.patterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Octal String: {}", Integer.toOctalString(subject.getState()));
    }
}
