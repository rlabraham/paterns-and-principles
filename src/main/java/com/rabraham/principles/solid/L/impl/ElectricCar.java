package com.rabraham.principles.solid.L.impl;

import com.rabraham.principles.solid.L.Car;

public class ElectricCar implements Car {
    @Override
    public void turnOnEngine() throws NoSuchFieldError {
        throw new NoSuchFieldError("Electric cars don't have engines");
    }

    @Override
    public void turnEngineOff() throws NoSuchFieldError {
        throw new NoSuchFieldError("Electric cars don't have engines");
    }

    @Override
    public void accelerate(int accelerationPercentage) {
    }
}
