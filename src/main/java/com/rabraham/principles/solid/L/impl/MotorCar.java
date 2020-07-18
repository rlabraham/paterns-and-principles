package com.rabraham.principles.solid.L.impl;

import com.rabraham.principles.solid.L.Car;
import com.rabraham.principles.solid.L.Engine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MotorCar implements Car {

    private Engine engine;

    @Override
    public void turnOnEngine() {
        this.engine.turnOn();
    }

    @Override
    public void turnEngineOff() {
        this.engine.turnOff();
    }

    @Override
    public void accelerate(int accelerationPercentage) throws IllegalArgumentException {
        if (accelerationPercentage < -100 || accelerationPercentage > 100) {
            throw new IllegalArgumentException("Acceleration amount must be between -100 and 100");
        }

        this.engine.powerUp(accelerationPercentage);
    }
}
