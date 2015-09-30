package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ForecastDay {
    private final ForecastDate date;
    private final Temperature high;
    private final Temperature low;
    private final String conditions;

    public ForecastDay(@JsonProperty("date") final ForecastDate date,
                       @JsonProperty("high") final Temperature high,
                       @JsonProperty("low") final Temperature low,
                       @JsonProperty("conditions") final String conditions) {
        this.date = date;
        this.high = high;
        this.low = low;
        this.conditions = conditions;
    }
}
