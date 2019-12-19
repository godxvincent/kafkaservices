package com.godxvincent.kafkaservices.repository;

import com.godxvincent.kafkaservices.models.Emisor;

import java.util.List;

public interface EmisorRepository {

    int count();

    int save(Emisor emisor);

    int update(Emisor emisor);

    int deleteById(Long id, String idEmisorLeasin);

    List<Emisor> findAll();

    Emisor findByEmisorId(Long id, String idEmisorLeasin);
}
