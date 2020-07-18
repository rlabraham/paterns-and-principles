package com.rabraham.principles.solid.O;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectricGuitar extends Guitar {
    private BodyType bodyType;

    public ElectricGuitar(String make, String model, int volume, BodyType bodyType) {
        super(make, model, volume);
        this.bodyType = bodyType;
    }
}
