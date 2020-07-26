package com.rabraham.patterns.behavioral.command.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        log.info("Stock [Name: {}, Quantity: {}] bought", name, quantity);
    }
    public void sell(){
        log.info("Stock [Name: {}, Quantity: {}] sold", name, quantity);
    }
}
