package com.rabraham.patterns.circuitbreaker;

import java.time.LocalDateTime;

public interface CircuitBreakerStateStore {
    CircuitBreakerStateEnum getState();

    Exception getLastException();

    LocalDateTime getLastStateChangedDateUtc();

    void trip(Exception ex);

    void reset();

    void halfOpen();

    boolean isClosed();
}
