package com.example.services.domain.conditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ConditionWrapper {
    private final Condition condition;

    public ConditionWrapper(@JsonProperty("current_observation") final Condition condition) {
        this.condition = condition;
    }
}
