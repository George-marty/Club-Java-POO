package com.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
public class orquesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatoRegional= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Socios> cupos = new ArrayList<>();
        GestionDatos gd = new GestionDatos();
        
        System.out.print("Ingrese nombre de su Club: ");
        String nombreClub = sc.nextLine();

        System.out.print("Ingrese el total de miembros a incluir: ");
        int miembroTotal = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese fecha de abertura: ");
        String inicios = sc.nextLine();
        LocalDate fechaAbertura = LocalDate.parse(inicios,formatoRegional);
        
        InicioClub ic = new InicioClub(nombreClub, miembroTotal, fechaAbertura);
        
        int opcion;
        do {
            gd.menu();
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            
            gd.interaccionMenu(opcion, sc, cupos, ic, formatoRegional);
        
        } while (opcion != 4); // 0 para salir
        
    

        sc.close();
    }
}
