package com.rabraham.patterns.behavioral.command.impl;

import com.rabraham.patterns.behavioral.command.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellStock implements Order {
    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
