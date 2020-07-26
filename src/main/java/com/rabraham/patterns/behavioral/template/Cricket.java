package com.rabraham.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cricket extends Game {
    @Override
    void initialize() {
        log.info("Cricket Game initialized!");
    }

    @Override
    void start() {
        log.info("Cricket game started!");
    }

    @Override
    void end() {
        log.info("Cricket game ended!");
    }
}
