package com.propify.challenge.controller;

import com.propify.challenge.entities.Property;
import com.propify.challenge.entities.PropertyReport;
import com.propify.challenge.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

/**
 *  API endpoints for CRUD operations on entities of type Property
 * */

@RestController
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @GetMapping(value = "")
    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }

    @GetMapping(value = "")
    public Property findById(int id) {
        return propertyService.findById(id);
    }

    @PostMapping(value = "")
    public void insert(@Valid Property property) {
        // TODO: Property attributes must be validated
        propertyService.insert(property);
    }

    @PutMapping(value = "")
    public void update(@Valid Property property) {
        // TODO: Property attributes must be validated
        propertyService.update(property);
    }

    @DeleteMapping(value = "")
    public void delete(int id) {
        propertyService.delete(id);
    }

    @GetMapping(value = "")
    public PropertyReport report() {
        return propertyService.propertyReport();
    }
}
