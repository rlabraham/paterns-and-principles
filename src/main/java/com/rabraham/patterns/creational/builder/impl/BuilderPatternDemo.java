package com.rabraham.patterns.creational.builder.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        log.info("Veg Meal");
        vegMeal.showItems();
        log.info("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        log.info("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        log.info("Total Cost: " + nonVegMeal.getCost());
    }
}
