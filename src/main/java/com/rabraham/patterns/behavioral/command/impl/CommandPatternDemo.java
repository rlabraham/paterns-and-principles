package com.rabraham.patterns.behavioral.command.impl;

public class CommandPatternDemo {
    public static void main(String[] args) {
        final Stock abcStock = new Stock();
        final BuyStock buyStockOrder = new BuyStock(abcStock);
        final SellStock sellStockOrder = new SellStock(abcStock);

        final Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
