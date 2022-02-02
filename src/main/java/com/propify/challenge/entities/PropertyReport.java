package com.propify.challenge.entities;

import com.propify.challenge.constants.PropertyType;

import java.util.Map;

public class PropertyReport {

    Integer totalQuantity;

    Map<PropertyType, Integer> quantityPerType;

    double averageRentPrice;

    Integer illinoisQuantity;
}
