package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SimpleForecast {
    private final ForecastDay[] days;

    public SimpleForecast(@JsonProperty("forecastday") final ForecastDay[] days) {
        this.days = days;
    }
}
