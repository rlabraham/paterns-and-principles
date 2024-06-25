package com.rabraham.patterns.circuitbreaker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CircuitBreakerStateStoreImpl implements CircuitBreakerStateStore {
    private CircuitBreakerStateEnum state;
    private Exception lastException;
    private LocalDateTime lastStateChangedDateUtc;

    private boolean closed;

    @Override
    public void trip(Exception ex) {
        System.out.println("Trip Circuit Breaker");
    }

    @Override
    public void reset() {
        System.out.println("Circuit Breaker is reset");
    }

    @Override
    public void halfOpen() {
        System.out.println("Circuit Breaker is half open");
    }
}
