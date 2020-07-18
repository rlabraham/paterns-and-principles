package com.rabraham.principles.solid.D.impl;

import com.rabraham.principles.solid.D.Keyboard;
import com.rabraham.principles.solid.D.Monitor;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Dependency Inversion - The principle of Dependency Inversion refers to the decoupling of software modules.
 * This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
 */
@Getter
@AllArgsConstructor
public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;
}
