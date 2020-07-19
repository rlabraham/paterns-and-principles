package com.rabraham.principles.solid.D.impl;

import com.rabraham.principles.solid.D.Keyboard;
import com.rabraham.principles.solid.D.Monitor;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;
}
