package com.example.demo.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConsumerComponent {
    
    @JmsListener(destination = "ParkYG-queue")
    public void consumeMessage(String message) {
        log.info("Message received from activemq queue---" + message);
    }
}
