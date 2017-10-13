package com.example.sistemas.datosmunicipio.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sistemas on 9/10/17.
 */

public class Municipio {

    @SerializedName("codigo_dane_municipio")
    @Expose
    private String codigoDaneMunicipio;
    @SerializedName("correocontactenos")
    @Expose
    private String correocontactenos;
    @SerializedName("direcci_n")
    @Expose
    private String direcciN;
    @SerializedName("nit")
    @Expose
    private String nit;
    @SerializedName("nombre_alcalde")
    @Expose
    private String nombreAlcalde;
    @SerializedName("nombre_municipio")
    @Expose
    private String nombreMunicipio;
    @SerializedName("portalweb")
    @Expose
    private String portalweb;
    @SerializedName("telefono_de_contacto")
    @Expose
    private String telefonoDeContacto;

    public String getCodigoDaneMunicipio() {
        return codigoDaneMunicipio;
    }

    public void setCodigoDaneMunicipio(String codigoDaneMunicipio) {
        this.codigoDaneMunicipio = codigoDaneMunicipio;
    }

    public String getCorreocontactenos() {
        return correocontactenos;
    }

    public void setCorreocontactenos(String correocontactenos) {
        this.correocontactenos = correocontactenos;
    }

    public String getDirecciN() {
        return direcciN;
    }

    public void setDirecciN(String direcciN) {
        this.direcciN = direcciN;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreAlcalde() {
        return nombreAlcalde;
    }

    public void setNombreAlcalde(String nombreAlcalde) {
        this.nombreAlcalde = nombreAlcalde;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getPortalweb() {
        return portalweb;
    }

    public void setPortalweb(String portalweb) {
        this.portalweb = portalweb;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

}
