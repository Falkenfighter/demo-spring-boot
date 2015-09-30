package com.example.services.domain.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ForecastDate {
    private final int day;
    private final int month;
    private final int year;

    public ForecastDate(@JsonProperty("day") final int day,
                        @JsonProperty("month") final int month,
                        @JsonProperty("year") final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
