package com.example.servicio.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;

import com.example.modelo.Actividades;
import com.example.servicio.ActividadesServicios;

public class ActividadesServicioImpl implements ActividadesServicios {
    
    private LinkedList<Actividades> listaActividades = new LinkedList<>();

    @Override
    public void agregarActividad(Scanner sc){
        
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        
        Actividades actividad = new Actividades();
        
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        actividad.setNombre(nombre);
        
        System.out.print("Ingrese cupos: ");
        int dato = sc.nextInt();
        actividad.setCupo(dato);
        
        System.out.println("¿La actividad está disponible? (true/false):");
        Boolean disponible = sc.nextBoolean();
        actividad.setDisponible(disponible);
        sc.nextLine();
        LocalDate fechaAct = null;

        while (fechaAct == null) {
            try {
                System.out.print("Ingrese fecha de la Actividad (dd/MM/yyyy): ");
                String fechaStr = sc.nextLine();
                fechaAct = LocalDate.parse(fechaStr, FORMATTER);

                // Validación adicional
                if (fechaAct.isAfter(LocalDate.now())) {
                    System.out.println("Fecha futura no permitida");
                    fechaAct = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Use dd/MM/yyyy");
            }
        }
        actividad.setFechaInicio(fechaAct);

        
        
        listaActividades.add(actividad);         
        
        }

        @Override
    public void mostrarActividad() {
        System.out.println("Lista de actividad registrados:");
        for (Actividades actividades : listaActividades) {
            System.out.println(actividades.toString());
        }
    }
}
