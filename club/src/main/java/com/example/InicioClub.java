package com.example;

import java.time.LocalDate;

public class InicioClub {
    String nombreClub;
    int miembroTotal;
    boolean abierto = false;
    LocalDate fechaAbertura;
    
    public InicioClub(String nombreClub, int miembroTotal, LocalDate fechaAbertura) {
        this.nombreClub = nombreClub;
        this.miembroTotal = miembroTotal;
        this.fechaAbertura = fechaAbertura;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getMiembroTotal() {
        return miembroTotal;
    }

    public void setMiembroTotal(int miembroTotal) {
        this.miembroTotal = miembroTotal;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public LocalDate getFechaAbertura() {
        return fechaAbertura;
    }

    public void setFechaAbertura(LocalDate fechaAbertura) {
        this.fechaAbertura = fechaAbertura;
    }

    
    
    
    

    
    

    

    

    

}
