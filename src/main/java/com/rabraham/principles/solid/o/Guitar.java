package com.rabraham.principles.solid.o;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Open-closed principle - classes should be open for extension, but closed for modification.
 * In doing so, we stop ourselves from modifying existing code and causing potential new bugs.
 *
 * The only exception to this rule is when fixing bugs in existing code.
 */
@Getter
@Setter
public class Guitar {
    private String make;
    private String model;
    private int volume;

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }
}
