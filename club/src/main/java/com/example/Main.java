package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.modelo.Clubes;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in); 
        ArrayList<Clubes> registroClub = new ArrayList<>();

        Clubes c2 = new Clubes();
        System.out.print("Ingrese el nombre de su club: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la cantidad de socios: ");
        int socios = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la fehca de fundacion: ");
        String fecha = sc.nextLine();
        LocalDate fechaFundacion = LocalDate.parse(fecha,formato);
        Clubes c1 = new Clubes(nombre, socios, false, fechaFundacion);

        c2.ingresarDatosClub(registroClub);
        
        c1.fichaClub();

        sc.close();
    }
}
