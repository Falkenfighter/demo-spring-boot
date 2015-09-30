package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Temperature {
    private final String fahrenheit;
    private final String celsius;

    public Temperature(@JsonProperty("fahrenheit") final String fahrenheit,
                       @JsonProperty("celsius") final String celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }
}
