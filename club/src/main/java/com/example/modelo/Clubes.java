package com.example.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

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
    


    public void fichaClub(){
        System.out.println("El nombre del club es: "+this.nombre);
        System.out.println("la cantidad de socios es de : "+this.socios);
        System.out.println("El estado actual del club es de :"+this.activo);
        System.out.println("La fecha de fundacion es de: "+this.fechaFundacion);
    }
    
    public void ingresarDatosClub(ArrayList<Clubes> lista){
        for (int i = 0; i < 1; i++) {
            
            
        }
    }
    
    

    

    

}
