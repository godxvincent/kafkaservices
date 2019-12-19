package com.godxvincent.kafkaservices.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emisor {

    @Id
    @GeneratedValue
    private Integer emisoresId;

    private String emisoresIsin;

    private String emisoresDoc;

    private String emisoresPais;

    private Integer emisoresOfic;

    private Integer emisoresDep;

    private String emisoresCiudad;

    private String emisoresNumident;

    private String emisoresNemo;

    private String emisoresFecvin;

    private String emisoresFecret;

    private Integer emisoresNumterm;

    private String emisoresNivcon;

    private String emisoresEstado;

    private String emisoresNomrl;

    private String emisoresRazonsoc;

    private String emisoresDirEmi;

    private String  emisoresDirEmail;

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

    public Emisor(Integer emisoresId, String emisoresIsin, String emisoresDoc, String emisoresPais, Integer emisoresOfic, Integer emisoresDep, String emisoresCiudad, String emisoresNumident, String emisoresNemo, String emisoresFecvin, String emisoresFecret, Integer emisoresNumterm, String emisoresNivcon, String emisoresEstado, String emisoresNomrl, String emisoresRazonsoc, String emisoresDirEmi, String emisoresDirEmail, String emisoresFecont, String emisoresNumcont, String emisoresRefcont, String emisoresFecafil, String emisoresTipcob, String emisoresFecint, String emisoresFecreg, String emisoresFecgrab, String emisoresUsugrab, String emisoresVengrab, String emisoresCodemisin) {
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
        this.emisoresNumterm = emisoresNumterm;
        this.emisoresNivcon = emisoresNivcon;
        this.emisoresEstado = emisoresEstado;
        this.emisoresNomrl = emisoresNomrl;
        this.emisoresRazonsoc = emisoresRazonsoc;
        this.emisoresDirEmi = emisoresDirEmi;
        this.emisoresDirEmail = emisoresDirEmail;
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

    public String getEmisoresPais() {
        return emisoresPais;
    }

    public void setEmisoresPais(String emisoresPais) {
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

    public Integer getEmisoresNumterm() {
        return emisoresNumterm;
    }

    public void setEmisoresNumterm(Integer emisoresNumterm) {
        this.emisoresNumterm = emisoresNumterm;
    }

    public String getEmisoresNivcon() {
        return emisoresNivcon;
    }

    public void setEmisoresNivcon(String emisoresNivcon) {
        this.emisoresNivcon = emisoresNivcon;
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

    public String getEmisoresRazonsoc() {
        return emisoresRazonsoc;
    }

    public void setEmisoresRazonsoc(String emisoresRazonsoc) {
        this.emisoresRazonsoc = emisoresRazonsoc;
    }

    public String getEmisoresDirEmi() {
        return emisoresDirEmi;
    }

    public void setEmisoresDirEmi(String emisoresDirEmi) {
        this.emisoresDirEmi = emisoresDirEmi;
    }

    public String getEmisoresDirEmail() {
        return emisoresDirEmail;
    }

    public void setEmisoresDirEmail(String emisoresDirEmail) {
        this.emisoresDirEmail = emisoresDirEmail;
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

    @Override
    public String toString() {
        return "Emisor{" +
                "emisoresId=" + emisoresId +
                ", emisoresIsin='" + emisoresIsin + '\'' +
                ", emisoresDoc='" + emisoresDoc + '\'' +
                ", emisoresPais='" + emisoresPais + '\'' +
                ", emisoresOfic=" + emisoresOfic +
                ", emisoresDep=" + emisoresDep +
                ", emisoresCiudad='" + emisoresCiudad + '\'' +
                ", emisoresNumident='" + emisoresNumident + '\'' +
                ", emisoresNemo='" + emisoresNemo + '\'' +
                ", emisoresFecvin='" + emisoresFecvin + '\'' +
                ", emisoresFecret='" + emisoresFecret + '\'' +
                ", emisoresNumterm=" + emisoresNumterm +
                ", emisoresNivcon='" + emisoresNivcon + '\'' +
                ", emisoresEstado='" + emisoresEstado + '\'' +
                ", emisoresNomrl='" + emisoresNomrl + '\'' +
                ", emisoresRazonsoc='" + emisoresRazonsoc + '\'' +
                ", emisoresDirEmi='" + emisoresDirEmi + '\'' +
                ", emisoresDirEmail='" + emisoresDirEmail + '\'' +
                ", emisoresFecont='" + emisoresFecont + '\'' +
                ", emisoresNumcont='" + emisoresNumcont + '\'' +
                ", emisoresRefcont='" + emisoresRefcont + '\'' +
                ", emisoresFecafil='" + emisoresFecafil + '\'' +
                ", emisoresTipcob='" + emisoresTipcob + '\'' +
                ", emisoresFecint='" + emisoresFecint + '\'' +
                ", emisoresFecreg='" + emisoresFecreg + '\'' +
                ", emisoresFecgrab='" + emisoresFecgrab + '\'' +
                ", emisoresUsugrab='" + emisoresUsugrab + '\'' +
                ", emisoresVengrab='" + emisoresVengrab + '\'' +
                ", emisoresCodemisin='" + emisoresCodemisin + '\'' +
                '}';
    }
}
