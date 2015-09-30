package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Forecast {
    private final SimpleForecast simpleForecast;

    public Forecast(@JsonProperty("simpleforecast") final SimpleForecast simpleForecast) {
        this.simpleForecast = simpleForecast;
    }
}
