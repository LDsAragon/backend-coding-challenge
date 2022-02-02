package com.propify.challenge.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlertService {

    public void sendPropertyDeletedAlert(int id) {
        log.info("The element with id: "+ id + " was properly deleted.");
    }
}
