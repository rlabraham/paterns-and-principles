package com.rabraham.patterns.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
