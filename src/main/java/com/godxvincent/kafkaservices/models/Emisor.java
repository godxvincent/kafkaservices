package com.godxvincent.kafkaservices.models;

import java.sql.Timestamp;

//TODO actualizar los atributos de acuerdo a la tabla de DB2
public class Emisor {

    private Integer emisoresId;

    private String emisoresIsin;

    private String emisoresDoc;

    private Integer emisoresPais;

    private Integer emisoresOfic;

    private Integer emisoresDep;

    private String emisoresCiudad;

    private String emisoresNumident;

    private String emisoresNemo;

    private String emisoresFecvin;

    private String emisoresFecret;

    private String emisoresNivcon;

    private String emisoresNumterm;

    private String emisoresEstado;

    private String emisoresNomrl;

    private String emisoresRazonsocial;

    private String emisoresDiremi;

    private String  emisoresDiremail;

    private String emisoresFecont;

    private String emisoresNumcont;

    private String emisoresRefcont;

    private String emisoresFecafil;

    private String emisoresTipcob;

    private String emisoresFecint;

    private String emisoresFecreg;

    private String emisoresFecgrab;

    private String emisoresUsugrab;

    private String emisoresVengrab;

    private String emisoresCodemisin;


    public Emisor() {
    }

    public Emisor(Integer emisoresId, String emisoresIsin, String emisoresDoc, Integer emisoresPais, Integer emisoresOfic, Integer emisoresDep, String emisoresCiudad, String emisoresNumident, String emisoresNemo, String emisoresFecvin, String emisoresFecret, String emisoresNivcon, String emisoresNumterm, String emisoresEstado, String emisoresNomrl, String emisoresRazonsocial, String emisoresDiremi, String emisoresDiremail, String emisoresFecont, String emisoresNumcont, String emisoresRefcont, String emisoresFecafil, String emisoresTipcob, String emisoresFecint, String emisoresFecreg, String emisoresFecgrab, String emisoresUsugrab, String emisoresVengrab, String emisoresCodemisin) {
        this.emisoresId = emisoresId;
        this.emisoresIsin = emisoresIsin;
        this.emisoresDoc = emisoresDoc;
        this.emisoresPais = emisoresPais;
        this.emisoresOfic = emisoresOfic;
        this.emisoresDep = emisoresDep;
        this.emisoresCiudad = emisoresCiudad;
        this.emisoresNumident = emisoresNumident;
        this.emisoresNemo = emisoresNemo;
        this.emisoresFecvin = emisoresFecvin;
        this.emisoresFecret = emisoresFecret;
        this.emisoresNivcon = emisoresNivcon;
        this.emisoresNumterm = emisoresNumterm;
        this.emisoresEstado = emisoresEstado;
        this.emisoresNomrl = emisoresNomrl;
        this.emisoresRazonsocial = emisoresRazonsocial;
        this.emisoresDiremi = emisoresDiremi;
        this.emisoresDiremail = emisoresDiremail;
        this.emisoresFecont = emisoresFecont;
        this.emisoresNumcont = emisoresNumcont;
        this.emisoresRefcont = emisoresRefcont;
        this.emisoresFecafil = emisoresFecafil;
        this.emisoresTipcob = emisoresTipcob;
        this.emisoresFecint = emisoresFecint;
        this.emisoresFecreg = emisoresFecreg;
        this.emisoresFecgrab = emisoresFecgrab;
        this.emisoresUsugrab = emisoresUsugrab;
        this.emisoresVengrab = emisoresVengrab;
        this.emisoresCodemisin = emisoresCodemisin;
    }

    public Emisor(long emisoresId, Timestamp emisoresFecint ) {
    }

    public Integer getEmisoresId() {
        return emisoresId;
    }

    public void setEmisoresId(Integer emisoresId) {
        this.emisoresId = emisoresId;
    }

    public String getEmisoresIsin() {
        return emisoresIsin;
    }

    public void setEmisoresIsin(String emisoresIsin) {
        this.emisoresIsin = emisoresIsin;
    }

    public String getEmisoresDoc() {
        return emisoresDoc;
    }

    public void setEmisoresDoc(String emisoresDoc) {
        this.emisoresDoc = emisoresDoc;
    }

    public Integer getEmisoresPais() {
        return emisoresPais;
    }

    public void setEmisoresPais(Integer emisoresPais) {
        this.emisoresPais = emisoresPais;
    }

    public Integer getEmisoresOfic() {
        return emisoresOfic;
    }

    public void setEmisoresOfic(Integer emisoresOfic) {
        this.emisoresOfic = emisoresOfic;
    }

    public Integer getEmisoresDep() {
        return emisoresDep;
    }

    public void setEmisoresDep(Integer emisoresDep) {
        this.emisoresDep = emisoresDep;
    }

    public String getEmisoresCiudad() {
        return emisoresCiudad;
    }

    public void setEmisoresCiudad(String emisoresCiudad) {
        this.emisoresCiudad = emisoresCiudad;
    }

    public String getEmisoresNumident() {
        return emisoresNumident;
    }

    public void setEmisoresNumident(String emisoresNumident) {
        this.emisoresNumident = emisoresNumident;
    }

    public String getEmisoresNemo() {
        return emisoresNemo;
    }

    public void setEmisoresNemo(String emisoresNemo) {
        this.emisoresNemo = emisoresNemo;
    }

    public String getEmisoresFecvin() {
        return emisoresFecvin;
    }

    public void setEmisoresFecvin(String emisoresFecvin) {
        this.emisoresFecvin = emisoresFecvin;
    }

    public String getEmisoresFecret() {
        return emisoresFecret;
    }

    public void setEmisoresFecret(String emisoresFecret) {
        this.emisoresFecret = emisoresFecret;
    }

    public String getEmisoresNivcon() {
        return emisoresNivcon;
    }

    public void setEmisoresNivcon(String emisoresNivcon) {
        this.emisoresNivcon = emisoresNivcon;
    }

    public String getEmisoresNumterm() {
        return emisoresNumterm;
    }

    public void setEmisoresNumterm(String emisoresNumterm) {
        this.emisoresNumterm = emisoresNumterm;
    }

    public String getEmisoresEstado() {
        return emisoresEstado;
    }

    public void setEmisoresEstado(String emisoresEstado) {
        this.emisoresEstado = emisoresEstado;
    }

    public String getEmisoresNomrl() {
        return emisoresNomrl;
    }

    public void setEmisoresNomrl(String emisoresNomrl) {
        this.emisoresNomrl = emisoresNomrl;
    }

    public String getEmisoresRazonsocial() {
        return emisoresRazonsocial;
    }

    public void setEmisoresRazonsocial(String emisoresRazonsocial) {
        this.emisoresRazonsocial = emisoresRazonsocial;
    }

    public String getEmisoresDiremi() {
        return emisoresDiremi;
    }

    public void setEmisoresDiremi(String emisoresDiremi) {
        this.emisoresDiremi = emisoresDiremi;
    }

    public String getEmisoresDiremail() {
        return emisoresDiremail;
    }

    public void setEmisoresDiremail(String emisoresDiremail) {
        this.emisoresDiremail = emisoresDiremail;
    }

    public String getEmisoresFecont() {
        return emisoresFecont;
    }

    public void setEmisoresFecont(String emisoresFecont) {
        this.emisoresFecont = emisoresFecont;
    }

    public String getEmisoresNumcont() {
        return emisoresNumcont;
    }

    public void setEmisoresNumcont(String emisoresNumcont) {
        this.emisoresNumcont = emisoresNumcont;
    }

    public String getEmisoresRefcont() {
        return emisoresRefcont;
    }

    public void setEmisoresRefcont(String emisoresRefcont) {
        this.emisoresRefcont = emisoresRefcont;
    }

    public String getEmisoresFecafil() {
        return emisoresFecafil;
    }

    public void setEmisoresFecafil(String emisoresFecafil) {
        this.emisoresFecafil = emisoresFecafil;
    }

    public String getEmisoresTipcob() {
        return emisoresTipcob;
    }

    public void setEmisoresTipcob(String emisoresTipcob) {
        this.emisoresTipcob = emisoresTipcob;
    }

    public String getEmisoresFecint() {
        return emisoresFecint;
    }

    public void setEmisoresFecint(String emisoresFecint) {
        this.emisoresFecint = emisoresFecint;
    }

    public String getEmisoresFecreg() {
        return emisoresFecreg;
    }

    public void setEmisoresFecreg(String emisoresFecreg) {
        this.emisoresFecreg = emisoresFecreg;
    }

    public String getEmisoresFecgrab() {
        return emisoresFecgrab;
    }

    public void setEmisoresFecgrab(String emisoresFecgrab) {
        this.emisoresFecgrab = emisoresFecgrab;
    }

    public String getEmisoresUsugrab() {
        return emisoresUsugrab;
    }

    public void setEmisoresUsugrab(String emisoresUsugrab) {
        this.emisoresUsugrab = emisoresUsugrab;
    }

    public String getEmisoresVengrab() {
        return emisoresVengrab;
    }

    public void setEmisoresVengrab(String emisoresVengrab) {
        this.emisoresVengrab = emisoresVengrab;
    }

    public String getEmisoresCodemisin() {
        return emisoresCodemisin;
    }

    public void setEmisoresCodemisin(String emisoresCodemisin) {
        this.emisoresCodemisin = emisoresCodemisin;
    }
}
