package com.rabraham.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Football extends Game {
    @Override
    void initialize() {
        log.info("Football game started!");
    }

    @Override
    void start() {
        log.info("Football game started!");
    }

    @Override
    void end() {
        log.info("Football game ended!");
    }
}
