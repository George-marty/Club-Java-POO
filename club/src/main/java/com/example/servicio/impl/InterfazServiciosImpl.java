package com.example.servicio.impl;



import com.example.servicio.interfazServicios;

public class InterfazServiciosImpl implements interfazServicios{
    
    
    @Override
    public void mostrarMenu(){
        System.out.println("---------Creacion Club-----");
        System.out.println("1)Crear Actividad");
        System.out.println("2)Mostrar Actividad");
        System.out.println("3)Crear Club");
        System.out.println("4)Mostrar Club");
        System.out.println("5)Salir");
        System.out.print("Ingrese opcion: ");
        
    }
    
}
