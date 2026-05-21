package com.example.servicio.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;


import com.example.modelo.Clubes;
import com.example.servicio.ClubesServicios;

public class ClubesServiciosImpl implements ClubesServicios {
    
    private LinkedList<Clubes> listaClubes = new LinkedList<>();
    
    @Override
    public void registrarClubes(Scanner sc){
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Clubes club = new Clubes();

        System.out.print("Ingrese nombre club: ");
        String nombre = sc.nextLine();
        club.setNombre(nombre);

        System.out.print("Ingrese los socios: ");
        int socios = sc.nextInt();
        club.setSocios(socios);

        System.out.print("¿El Club está disponible? (true/false): ");
        Boolean disponible = sc.nextBoolean();
        club.setActivo(disponible);
        sc.nextLine();

        LocalDate fechaClu = null;

        while (fechaClu == null) {
            try {
                System.out.print("Ingrese fecha de Club (dd/MM/yyyy): ");
                String fechaStr = sc.nextLine();
                fechaClu = LocalDate.parse(fechaStr, FORMATTER);

                // Validación adicional
                if (fechaClu.isAfter(LocalDate.now())) {
                    System.out.println("Fecha futura no permitida");
                    fechaClu = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Use dd/MM/yyyy");
            }
        }
        club.setFechaFundacion(fechaClu);
        
        
        
        listaClubes.add(club); 



    }
    @Override
    public void mostrarClubes() {
        System.out.println("Lista de actividad registrados:");
        for (Clubes clubes : listaClubes) {
            System.out.println(clubes.toString());
        }
    }
    
}
