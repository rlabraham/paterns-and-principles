package com.rabraham.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        log.info("Hello World!");
    }
}
