package com.godxvincent.kafkaservices.controllers;

import com.godxvincent.kafkaservices.models.Emisor;
import com.godxvincent.kafkaservices.repository.EmisorRepository;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.listener.LoggingErrorHandler;
import org.springframework.web.bind.annotation.*;

import com.godxvincent.kafkaservices.producers.Producer;

import java.util.List;

@RestController()
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    private final Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    public EmisorRepository emisorRepository;

    @PostMapping(value = "/save")
    @CrossOrigin
    public ResponseEntity<Emisor> crearEmisor(@RequestBody Emisor emisor) {
        logger.info(emisor.toString());
        this.emisorRepository.save(emisor);
        this.producer.sendMessage(emisor.toString());
        return new ResponseEntity(emisor,HttpStatus.OK);
    }

    @GetMapping(value = "/getById")
    @CrossOrigin
    public Emisor consultarEmisor(@RequestParam(required=true) Long idEmisor, @RequestParam(required=true) String idEmisorLeasin) {
        Emisor emisor = this.emisorRepository.findByEmisorId(idEmisor, idEmisorLeasin);
        return emisor;
    }

    @GetMapping(value = "/getAll")
    @CrossOrigin
    public List<Emisor> consultarEmisores() {
        List<Emisor> emisores = this.emisorRepository.findAll();
        return emisores;
    }

    @PutMapping(value = "/update")
    @CrossOrigin
    public ResponseEntity<Emisor> actualizarEmisor(@RequestBody Emisor emisor) {
        this.emisorRepository.update(emisor);
        this.producer.sendMessage(emisor.toString());
        return new ResponseEntity (emisor,HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById")
    @CrossOrigin
    public ResponseEntity<String> eliminarEmisor(@RequestParam(required=true) Long idEmisor, @RequestParam(required=true) String idEmisorLeasin) {
        this.emisorRepository.deleteById(idEmisor, idEmisorLeasin);
        this.producer.sendMessage("El emisor asociado con el identificador " + idEmisor + " ha sido eliminado.");
        return new ResponseEntity(HttpStatus.OK);
    }

}