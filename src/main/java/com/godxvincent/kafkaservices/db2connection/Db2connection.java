package com.godxvincent.kafkaservices.db2connection;

import com.godxvincent.kafkaservices.models.Emisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class Db2connection {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //TODO Ajustar metodos de consulta
    public ResponseEntity<String> db2connection() {
        List<String> list = new ArrayList();
        list.add("Table data...");
        jdbcTemplate.query(
                "SELECT * FROM EMISORES", new Object[]{},
                (rs, rowNum) -> new Emisor(rs.getLong("id"),
                                           rs.getTimestamp("name")
                ))
                .forEach(thing -> list.add(thing.toString()));
        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }
}
