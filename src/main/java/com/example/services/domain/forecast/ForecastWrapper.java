package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ForecastWrapper {
    private final Forecast forecast;

    public ForecastWrapper(@JsonProperty("forecast") final Forecast forecast) {
        this.forecast = forecast;
    }
}
