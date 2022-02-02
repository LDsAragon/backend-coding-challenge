package com.propify.challenge.entities;

import com.propify.challenge.constants.PropertyType;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Map;

public class PropertyReport {

    @NotNull
    Integer totalQuantity;

    @NotNull
    Map<PropertyType, Integer> quantityPerType;

    @NotNull
    BigDecimal averageRentPrice;

    @NotNull
    Integer illinoisQuantity;
}
