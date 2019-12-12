package com.godxvincent.kafkaservices.controllers;

import com.godxvincent.kafkaservices.db2connection.Db2connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godxvincent.kafkaservices.producers.Producer;

@RestController()
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    private Db2connection db2connectionTest;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        ResponseEntity<String>  result = db2connectionTest.db2connection();
        this.producer.sendMessage(message);
    }
    
}