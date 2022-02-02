package com.propify.challenge.service;

import com.propify.challenge.entities.Property;
import com.propify.challenge.entities.PropertyReport;
import com.propify.challenge.mappers.AddressMapper;
import com.propify.challenge.mappers.PropertyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Slf4j
@Service
public class PropertyService {

    @Autowired
    PropertyMapper propertyMapper;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AlertService alertService;

    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        log.info("Starting search for rent prices between  : " + minRentPrice + " and " + maxRentPrice);
        return propertyMapper.search(minRentPrice, maxRentPrice);
    }

    public Property findById(int id) {
        log.info("Starting findById for : " + id);
        return propertyMapper.findById(id);
    }

    public void insert(Property property) {
        propertyMapper.insert(property);
        log.info("CREATED: " + property.id);
    }

    public void update(Property property) {
        propertyMapper.update(property);
        log.info("UPDATED: " + property.id);
    }

    public void delete(int id) {
        propertyMapper.delete(id);
        log.info("DELETED: " + id);

        alertService.sendPropertyDeletedAlert(id);
        // TODO: Sending the alert should be non-blocking (asynchronous)
        //  Extra points for only sending the alert when/if the transaction is committed


       // async atempt
        CompletableFuture<Void> cfAlert = CompletableFuture.runAsync(()->{
            alertService.sendPropertyDeletedAlert(id);
        });

        TransactionStatus status = TransactionAspectSupport.currentTransactionStatus();
        //MAYBE THIS DOES IT ALL
        if (status.isCompleted()){
            try {
                cfAlert.get();
            } catch (InterruptedException | ExecutionException e) {
                log.info("Exception was thrown because : " + e.getCause() + "\n Message: " +e.getMessage());

            }
        }

        //MAYBE THIS DOES just the first part
            try {
                cfAlert.get();
            } catch (InterruptedException | ExecutionException e) {
                log.info("Exception was thrown because : " + e.getCause() + "\n Message: " +e.getMessage());

            }


    }


    // i dont had enough time "F"
    // maybe if i had a better understanding of how ibastis and the xml definition works i could have dont this parts faster
    // but the queries to complete the report dont seem complicated
    // all the properties, a count
    // all per type a group by plus a count or a sum but the answer is around there
    // an avg of the total sum of prices for al properties
    // all the properties in the state of illinois a count and a where state = IL
    public PropertyReport propertyReport() {
        var allProperties = propertyMapper.search(null, null);
        var propertyReport = new PropertyReport();

        // Calculate total quantity
        // propertyReport.totalQuantity =

        // Calculate the quantity of each type, 0 if there is no properties.
        // propertyReport.quantityPerType =

        // Calculate the average rent price (exclude the properties without rent price or with rent price = 0)
        // propertyReport.averageRentPrice =

        // Calculate the quantity of properties in the state of Illinois (IL)
        // propertyReport.illinoisQuantity =

        return propertyReport;
    }
}
