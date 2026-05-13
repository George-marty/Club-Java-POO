package com.example.servicio.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.example.modelo.Actividades;
import com.example.servicio.ActividadesServicios;

public class ActividadesServicioImpl implements ActividadesServicios {
    
    @Override
    public Actividades agregarActividad(LinkedList<Actividades> listaActividades){
        
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        
        Actividades actividad = new Actividades();
        
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        actividad.setNombre(nombre);
        
        System.out.print("Ingrese cupos");
        int dato = sc.nextInt();
        actividad.setCupo(dato);
        
        System.out.println("¿El destino está disponible? (true/false):");
        Boolean disponible = sc.nextBoolean();
        actividad.setDisponible(disponible);

        LocalDate fechaNac = null;

        while (fechaNac == null) {
            try {
                System.out.print("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
                String fechaStr = sc.nextLine();
                fechaNac = LocalDate.parse(fechaStr, FORMATTER);

                // Validación adicional
                if (fechaNac.isAfter(LocalDate.now())) {
                    System.out.println("Fecha futura no permitida");
                    fechaNac = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Use dd/MM/yyyy");
            }
        }

        
        
                        
        return actividad;
        }
}
