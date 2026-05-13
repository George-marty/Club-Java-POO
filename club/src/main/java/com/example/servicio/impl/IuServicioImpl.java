package com.example.servicio.impl;

import java.util.Scanner;

import com.example.servicio.Iu;

public class IuServicioImpl implements Iu{
    private Scanner sc = new Scanner(System.in);
    
    @Override
    public void mostrarMenu(){
        System.out.println("---------Creacion Club-----");
        System.out.println("1)Crear Actividad");
        System.out.println("2)Mostrar Actividad");
        System.out.println("3)Crear Club");
        System.out.println("4)Salir");
        
    }
    @Override
    public int leerOpcion(){
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
}
