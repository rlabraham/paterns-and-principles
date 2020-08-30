package com.rabraham.patterns.creational.builder.impl;

import com.rabraham.patterns.creational.builder.Item;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            log.info("Item : {}, Packing : {}, Price : {}", item.name(), item.packing().pack(), item.price());
        }
    }
}
