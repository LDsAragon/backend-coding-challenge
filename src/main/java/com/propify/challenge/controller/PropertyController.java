package com.propify.challenge.controller;

import com.propify.challenge.constants.UrlConstants;
import com.propify.challenge.entities.Property;
import com.propify.challenge.entities.PropertyReport;
import com.propify.challenge.service.PropertyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 *  API endpoints for CRUD operations on entities of type Property
 * */

@Slf4j
@RestController(UrlConstants.PROPERTY_CONTROLLER)
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @GetMapping(value = UrlConstants.SEARCH_BETWEEN)
    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }

    @GetMapping(value = UrlConstants.SEARCH_BY_ID)
    public Property findById(int id) {
        return propertyService.findById(id);
    }

    @PostMapping(value = UrlConstants.CREATE_PROPERTY)
    public void insert(@Validated(Insert.class) Property property) {
        propertyService.insert(property);
    }

    @PutMapping(value = UrlConstants.UPDATE_PROPERTY)
    public void update(@Validated(Update.class) Property property) {
        propertyService.update(property);
    }

    @DeleteMapping(value = UrlConstants.DELETE_PROPERTY)
    public void delete(int id) {
        propertyService.delete(id);
    }

    @GetMapping(value = UrlConstants.REPORT_PROPERTIES)
    public PropertyReport report() {
        return propertyService.propertyReport();
    }
}
