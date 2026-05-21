package com.example.modelo;

import java.time.LocalDate;


public class Clubes {
    private String nombre;
    private int socios;
    private boolean activo;
    private LocalDate fechaFundacion;
    
    public Clubes(){

    }

    public Clubes(String nombre, int socios, boolean activo, LocalDate fechaFundacion) {
        this.nombre = nombre;
        this.socios = socios;
        this.activo = true;
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSocios() {
        return socios;
    }

    public void setSocios(int socios) {
        this.socios = socios;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public String toString() {
        return "Clubes [nombre=" + nombre + ", socios=" + socios + ", activo=" + activo + ", fechaFundacion="
                + fechaFundacion + "]";
    }
    


    
    

    

    

}
