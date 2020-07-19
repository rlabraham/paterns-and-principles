package com.rabraham.principles.solid.O;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Guitar {
    private String make;
    private String model;
    private int volume;
}
