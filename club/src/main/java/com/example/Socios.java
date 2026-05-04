package com.example;

import java.time.LocalDate;

public class Socios {
    String nombre;
    String apellido;
    int idSocio;
    boolean SocioActivo;
    LocalDate fechaFundacion;
    
    public Socios(String nombre, String apellido, int idSocio,boolean SocioActivo, LocalDate fechaFundacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idSocio = idSocio;
        this.SocioActivo = SocioActivo;
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }
    public boolean isSocioActivo() {
        return SocioActivo;
    }

    public void setSocioActivo(boolean socioActivo) {
        SocioActivo = socioActivo;
    }
    

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    

    

}
