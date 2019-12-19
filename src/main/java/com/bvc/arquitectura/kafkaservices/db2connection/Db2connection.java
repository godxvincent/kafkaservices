package com.bvc.arquitectura.kafkaservices.db2connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bvc.arquitectura.kafkaservices.models.Emisor;
import com.bvc.arquitectura.kafkaservices.repository.EmisorRepository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class Db2connection implements EmisorRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //TODO Ajustar metodos de consulta de acuerdo a las pruebas
    @Override
    public int count() {
        return jdbcTemplate
                .queryForObject("select count(*) from EMISORES", Integer.class);
    }

    @Override
    public int save(Emisor emisor) {
        return jdbcTemplate.update(
                "INSERT INTO EMISORES (EMISORES_ID, EMISORES_ISIN, EMISORES_DOC, EMISORES_PAIS, EMISORES_OFIC, EMISORES_DEP, EMISORES_CIUDAD, " +
                        "EMISORES_NUMIDENT, EMISORES_NEMO, EMISORES_FECVIN, EMISORES_FECRET, EMISORES_NUMTERM, EMISORES_NIVCON, " +
                        "EMISORES_ESTADO, EMISORES_NOMRL, EMISORES_RAZONSOC, EMISORES_DIR_EMI, EMISORES_DIR_EMAIL, EMISORES_FECONT, " +
                        "EMISORES_NUMCONT, EMISORES_REFCONT, EMISORES_FECAFIL, EMISORES_TIPCOB, EMISORES_FECINT, EMISORES_FECREG, " +
                        "EMISORES_FECGRAB, EMISORES_USUGRAB, EMISORES_VENGRAB, EMISORES_COD_EMISIN) " +
                        "values" +
                        "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                emisor.getEmisoresId(), emisor.getEmisoresIsin(), emisor.getEmisoresDoc(), emisor.getEmisoresPais(), emisor.getEmisoresOfic(), emisor.getEmisoresDep(),
                emisor.getEmisoresCiudad(), emisor.getEmisoresNumident(), emisor.getEmisoresNemo(), convertStringtoTimestamp(emisor.getEmisoresFecvin()), convertStringtoTimestamp(emisor.getEmisoresFecret()),
                emisor.getEmisoresNumterm(), emisor.getEmisoresNivcon(), emisor.getEmisoresEstado(), emisor.getEmisoresNomrl(), emisor.getEmisoresRazonsoc(),
                emisor.getEmisoresDirEmi(), emisor.getEmisoresDirEmail(), emisor.getEmisoresFecont(), emisor.getEmisoresNumcont(), emisor.getEmisoresRefcont(), emisor.getEmisoresFecafil(),
                emisor.getEmisoresTipcob(), emisor.getEmisoresFecint(), emisor.getEmisoresFecreg(), convertStringtoTimestamp(emisor.getEmisoresFecgrab()),
                emisor.getEmisoresUsugrab(), emisor.getEmisoresVengrab(), emisor.getEmisoresCodemisin());
    }

    @Override
    public int update(Emisor emisor) {
        return jdbcTemplate.update(
                "UPDATE EMISORES set EMISORES_DOC = ? ,  EMISORES_PAIS = ? , EMISORES_OFIC = ?, EMISORES_DEP = ?, EMISORES_CIUDAD = ?, EMISORES_NUMIDENT = ?, " +
                        "EMISORES_NEMO = ?, EMISORES_FECVIN = ?, EMISORES_FECRET = ?, EMISORES_NUMTERM = ?, EMISORES_NIVCON = ?, EMISORES_ESTADO = ?, " +
                        "EMISORES_NOMRL = ?, EMISORES_RAZONSOC = ?, EMISORES_DIR_EMI = ?, EMISORES_DIR_EMAIL = ?, EMISORES_FECONT = ?, EMISORES_NUMCONT = ?, " +
                        "EMISORES_REFCONT = ?, EMISORES_FECAFIL = ?, EMISORES_TIPCOB = ?, EMISORES_FECINT = ?, EMISORES_FECREG = ?, EMISORES_FECGRAB = ?, " +
                        "EMISORES_USUGRAB = ?, EMISORES_VENGRAB = ?, EMISORES_COD_EMISIN = ?" +
                        "where EMISORES_ID = ? AND EMISORES_ISIN = ?",
                emisor.getEmisoresDoc(), emisor.getEmisoresPais(), emisor.getEmisoresOfic(), emisor.getEmisoresDep(),
                emisor.getEmisoresCiudad(), emisor.getEmisoresNumident(), emisor.getEmisoresNemo(), convertStringtoTimestamp(emisor.getEmisoresFecvin()), convertStringtoTimestamp(emisor.getEmisoresFecret()),
                emisor.getEmisoresNumterm(), emisor.getEmisoresNivcon(), emisor.getEmisoresEstado(), emisor.getEmisoresNomrl(), emisor.getEmisoresRazonsoc(),
                emisor.getEmisoresDirEmi(), emisor.getEmisoresDirEmail(), emisor.getEmisoresFecont(), emisor.getEmisoresNumcont(), emisor.getEmisoresRefcont(), emisor.getEmisoresFecafil(),
                emisor.getEmisoresTipcob(), emisor.getEmisoresFecint(), emisor.getEmisoresFecreg(), convertStringtoTimestamp(emisor.getEmisoresFecgrab()),
                emisor.getEmisoresUsugrab(), emisor.getEmisoresVengrab(), emisor.getEmisoresCodemisin(),
                emisor.getEmisoresId(), emisor.getEmisoresIsin());
    }

    @Override
    public int deleteById(Long id, String idEmisorLeasin) {
        return jdbcTemplate.update(
                "DELETE EMISORES where EMISORES_ID = ? AND EMISORES_ISIN = ?",
                id, idEmisorLeasin);
    }

    @Override
    public Emisor findByEmisorId(Long id, String idEmisorLeasin) {
        String sql = "SELECT * FROM EMISORES WHERE EMISORES_ID = ? AND EMISORES_ISIN = ?";
        return (Emisor) jdbcTemplate.queryForObject(sql, new Object[]{id, idEmisorLeasin}, new BeanPropertyRowMapper(Emisor.class));
    }

    @Override
    public List<Emisor> findAll() {
        String sql = "SELECT * FROM EMISORES";
        List<Emisor> customers = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Emisor.class));;
        return customers;
    }

    public Timestamp convertStringtoTimestamp (String stringDate){
        Date date = new Date();
        Timestamp timestamp = new java.sql.Timestamp(date.getTime());
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSSSS");
            Date parsedDate = dateFormat.parse(stringDate);
            timestamp = new java.sql.Timestamp(parsedDate.getTime());
        }
        catch(Exception e) { //this generic but you can control another types of exception
            // look the origin of excption
        }
        return timestamp;
    }

}
