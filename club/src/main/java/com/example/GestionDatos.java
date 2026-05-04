package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDatos {
    public void menu(){
        System.out.println("---------Creacion Club-----");
        System.out.println("1)Mostrar info del Club");
        System.out.println("2) Agrega miembros");
        System.out.println("3)Mostrar ficha de miembros");
        System.out.println("4)Salir");
        
    }
    public void interaccionMenu(int opcion,Scanner sc, ArrayList<Socios> lista,InicioClub miClub,DateTimeFormatter formatoRegional){

        switch (opcion) {
            case 1:
                System.out.println("Club: " + miClub.getNombreClub() + " | Cupo máximo: " + miClub.getMiembroTotal());

                break;
            case 2:
                System.out.println("---Ingreso socios---");
                for (int i = 0; i < miClub.getMiembroTotal(); i++) {
                    System.out.println("Socio " + (i+1) + " de " + miClub.getMiembroTotal()+":");
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese id del socio: ");
                    int idSocio = sc.nextInt();
                    sc.nextLine();
                    boolean socioActivo = true;
                    System.out.print("Introduce la fecha (dd-MM-yyyy): ");
                    String date = sc.nextLine();
                    LocalDate fechaFundacion = LocalDate.parse(date,formatoRegional);
                    
                    lista.add(new Socios(nombre, apellido, idSocio, socioActivo, fechaFundacion));
                    
                    }break;
            case 3:
                mostrarFicha(lista);
                break;
            case 4:
                System.out.println("Terminado");
                break;

        

        
            default:
                System.out.println("dato invalido");
                break;
        }
    }
    
    public void mostrarFichaSocio(Socios elsc){
        System.out.println("-----Ficha-----");
        System.out.println("Nombre del Socio: "+elsc.getNombre());
        System.out.println("Apellido del Socio: "+ elsc.getApellido());
        System.out.println("ID del Socio:"+ elsc.getIdSocio());
        System.out.println("El socio esta: "+elsc.isSocioActivo());
        System.out.println("Fecha de incripsion del Socio: "+elsc.getFechaFundacion());
        
    }
    public void mostrarFicha(ArrayList<Socios> lista ){
        if (lista.isEmpty()){
            System.out.println("No hay socios para mostrar");
        }
        else{
            for (Socios i : lista) {
            mostrarFichaSocio(i);
            }
        }
        
        
    }
   
}
