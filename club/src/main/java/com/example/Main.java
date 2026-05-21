package com.example;
import java.util.Scanner;
import com.example.servicio.ActividadesServicios;
import com.example.servicio.ClubesServicios;
import com.example.servicio.interfazServicios;
import com.example.servicio.impl.ActividadesServicioImpl;
import com.example.servicio.impl.ClubesServiciosImpl;
import com.example.servicio.impl.InterfazServiciosImpl;

public class Main {
    public static void main(String[] args) {
      ActividadesServicios serviciosActividades = new ActividadesServicioImpl();
      interfazServicios interfazServicios = new InterfazServiciosImpl();

      ClubesServicios clubesServicios = new ClubesServiciosImpl();
      Scanner sc = new Scanner(System.in);
      int opcion;

      do {
        interfazServicios.mostrarMenu();
        opcion = sc.nextInt();

      switch (opcion) {
            case 1:
                sc.nextLine();
                serviciosActividades.agregarActividad(sc);
                break;
            case 2:
              serviciosActividades.mostrarActividad();
              break;
            case 3:
              sc.nextLine();
              clubesServicios.registrarClubes(sc);
              break;
            case 4:
              clubesServicios.mostrarClubes();
              break;
            case 5:
              System.exit(0);
              sc.close();

        }
      } while (opcion != 5);
    
    }
}