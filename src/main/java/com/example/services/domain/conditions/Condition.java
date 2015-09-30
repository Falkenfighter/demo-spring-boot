package com.example.services.domain.conditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Condition {
    private final String weather;
    private final String temperature;
    private final String humidity;
    private final String wind;
    private final String feelsLike;

    public Condition(@JsonProperty("weather") final String weather,
                     @JsonProperty("temperature_string") final String temperature,
                     @JsonProperty("relative_humidity") final String humidity,
                     @JsonProperty("wind_string") final String wind,
                     @JsonProperty("feelslike_string") final String feelsLike) {
        this.weather = weather;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.feelsLike = feelsLike;
    }
}
