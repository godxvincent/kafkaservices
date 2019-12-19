package com.bvc.arquitectura.kafkaservices.repository;

import java.util.List;

import com.bvc.arquitectura.kafkaservices.models.Emisor;

public interface EmisorRepository {

    int count();

    int save(Emisor emisor);

    int update(Emisor emisor);

    int deleteById(Long id, String idEmisorLeasin);

    List<Emisor> findAll();

    Emisor findByEmisorId(Long id, String idEmisorLeasin);
}
