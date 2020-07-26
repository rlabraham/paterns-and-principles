package com.rabraham.patterns.behavioral.iterator.impl;

import com.rabraham.patterns.behavioral.iterator.Iterator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorPatternDemo {
    public static void main(String[] args) {
        final NameRepository namesRepository = new NameRepository();
        final Iterator<String> iterator = namesRepository.getIterator();

        while (iterator.hasNext()) {
            final String name = iterator.next();
            log.info("Name : {}", name);
        }
    }
}
