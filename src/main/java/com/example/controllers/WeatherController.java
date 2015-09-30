package com.example.controllers;

import com.example.services.domain.conditions.Condition;
import com.example.services.domain.forecast.Forecast;
import com.example.services.WeatherUnderground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("api/weather")
public class WeatherController {

    @Autowired WeatherUnderground weatherService;

    @RequestMapping(value = "/forecast/{zip}", method = GET, produces = APPLICATION_JSON_VALUE)
    public Forecast forecastByZip(@PathVariable final String zip) {
        return weatherService.getForecast(zip);
    }

    @RequestMapping(value = "/condition/{zip}", method = GET, produces = APPLICATION_JSON_VALUE)
    public Condition conditionByZip(@PathVariable final String zip) {
        return weatherService.getCondition(zip);
    }
}
