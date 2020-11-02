package com.rabraham.patterns.servicelocator.impl;

import com.rabraham.patterns.servicelocator.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        log.info("Executing Service2");
    }
}
