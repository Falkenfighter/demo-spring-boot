package com.example.services;

import com.example.services.domain.conditions.Condition;
import com.example.services.domain.conditions.ConditionWrapper;
import com.example.services.domain.forecast.Forecast;
import com.example.services.domain.forecast.ForecastWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherUnderground {

    private static final String JSON = ".json";

    @Autowired private RestTemplate template;
    @Value("${weather.underground.api}${weather.underground.key}") private String api;
    @Value("${weather.underground.features.forecast}") private String forecast;
    @Value("${weather.underground.features.conditions}") private String conditions;

    public Forecast getForecast(String zip) {
        return template.getForObject(api + forecast + zip + JSON, ForecastWrapper.class).getForecast();
    }

    public Condition getCondition(String zip) {
        return template.getForObject(api + conditions + zip + JSON, ConditionWrapper.class).getCondition();
    }
}
