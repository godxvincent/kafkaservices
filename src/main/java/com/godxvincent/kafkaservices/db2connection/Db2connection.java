package com.godxvincent.kafkaservices.db2connection;

import com.godxvincent.kafkaservices.models.Emisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.ArrayList;
import java.util.List;

public class Db2connection {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //TODO Ajustar metodos de consulta

    public ResponseEntity<Emisor> selectEntity(String idEmisor) {
        List<String> list = new ArrayList();
        Emisor emisorConsultado = new Emisor();
        jdbcTemplate.query(
                "SELECT * FROM EMISORES", new Object[]{},
                (rs, rowNum) -> new Emisor(rs.getLong("id"),
                        rs.getTimestamp("name")
                ))
                .forEach(thing -> list.add(thing.toString()));
        return new ResponseEntity<Emisor>(emisorConsultado, HttpStatus.OK);
    }

    public ResponseEntity<Emisor> createEntity(Emisor emisor) {

        String sqlInsertEmistor = "INSERT INTO EMISOR " +
                "(EMISORES_ID, EMISORES_ISIN, EMISORES_DOC, ) " +
                "VALUES " +
                "(:emisoresId, :emisoresIsin, :emisoresDoc)";
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(emisor);
        //jdbcTemplate.queryForObject();

        return new ResponseEntity<Emisor>(emisor, HttpStatus.OK);
    }

    public ResponseEntity<Emisor> updateEntity(Emisor emisor) {
        List<String> list = new ArrayList();
        list.add("Table data...");
        jdbcTemplate.query(
                "SELECT * FROM EMISORES", new Object[]{},
                (rs, rowNum) -> new Emisor(rs.getLong("id"),
                        rs.getTimestamp("name")
                ))
                .forEach(thing -> list.add(thing.toString()));
        return new ResponseEntity<>(emisor, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteEntity(String idEmisor) {
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
