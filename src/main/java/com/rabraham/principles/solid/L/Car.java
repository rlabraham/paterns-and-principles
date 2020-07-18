package com.rabraham.principles.solid.L;

/**
 * Liskov Substitution - if class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program
 */
public interface Car {
    void turnOnEngine();
    void turnEngineOff();
    void accelerate(int accelerationPercentage);
}
