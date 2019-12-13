package com.godxvincent.kafkaservices.controllers;

import com.godxvincent.kafkaservices.db2connection.Db2connection;
import com.godxvincent.kafkaservices.models.Emisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/create")
    public Emisor crearEmisor(@RequestBody Emisor emisor) {
        ResponseEntity<Emisor> emisorCreado = db2connectionTest.createEntity(emisor);
        this.producer.sendMessage(emisor.toString());
        return emisorCreado.getBody();
    }

    @GetMapping(value = "/select")
    public Emisor consultarEmisor(@RequestParam String idEmisor) {
        ResponseEntity<Emisor> emisorCreado = db2connectionTest.selectEntity(idEmisor);
        this.producer.sendMessage(idEmisor);
        return emisorCreado.getBody();
    }

    @PutMapping(value = "/update")
    public Emisor actualizarEmisor(@RequestBody Emisor emisor) {
        ResponseEntity<Emisor> emisorCreado = db2connectionTest.updateEntity(emisor);
        this.producer.sendMessage(emisorCreado.getBody().toString());
        return emisorCreado.getBody();
    }

    @DeleteMapping(value = "/delete")
    public String eliminarEmisor(@RequestParam String idEmisor) {
        ResponseEntity<String> emisorEliminado = db2connectionTest.deleteEntity(idEmisor);
        this.producer.sendMessage(emisorEliminado.toString());
        return emisorEliminado.toString();
    }

}