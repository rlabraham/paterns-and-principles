package com.rabraham.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplatePatternDemo {
    public static void main(String[] args) {

        final Game cricket = new Cricket();
        cricket.play();

        log.info("\n");

        final Game football = new Football();
        football.play();
    }
}
