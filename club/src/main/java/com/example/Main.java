package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.example.modelo.Actividades;
import com.example.modelo.Clubes;
import com.example.servicio.ActividadesServicios;
import com.example.servicio.Iu;
import com.example.servicio.impl.ActividadesServicioImpl;
import com.example.servicio.impl.IuServicioImpl;

public class Main {
    public static void main(String[] args) {
      ActividadesServicios serviciosActividades = new ActividadesServicioImpl();
      LinkedList<Actividades> listaActividades = new LinkedList<>();
      Iu iu = new IuServicioImpl();

      int opcion;

      do {
        iu.mostrarMenu();
        opcion = iu.leerOpcion();

      switch (opcion) {
            case 1:
                Actividades nuevaActividad = serviciosActividades.agregarActividad(listaActividades);
                listaActividades.add(nuevaActividad);
                break;
            case 4:
              System.exit(0);

        }
      } while (opcion != 4);
    
    }
}