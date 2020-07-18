package com.rabraham.principles.solid.I.impl;

import com.rabraham.principles.solid.I.BearCleaner;
import com.rabraham.principles.solid.I.BearFeeder;

/**
 * Interface Segregation - larger interfaces should be split into smaller ones.
 * By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
 */
public class BearCarer implements BearCleaner, BearFeeder {
    @Override
    public void cleanTheBear() {

    }

    @Override
    public void feedTheBear() {

    }
}
