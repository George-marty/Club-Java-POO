package com.example.modelo;

import java.time.LocalDate;

public class Actividades {
    private String nombre;
    private int cupo;
    private boolean disponible;
    private LocalDate fechaInicio;

    Actividades(){

    }

    public Actividades(String nombre, int cupo, boolean disponible, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.cupo = cupo;
        this.disponible = disponible;
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Actividades [nombre=" + nombre + ", cupo=" + cupo + ", disponible=" + disponible + ", fechaInicio="
                + fechaInicio + "]";
    }

    
    
    

}
