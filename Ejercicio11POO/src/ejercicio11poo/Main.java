package ejercicio11poo;


import Entidades.ClaseDate;


import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el dia");
        int dia = reader.nextInt();
        System.out.println("Ingrese el mes");
        int mes = reader.nextInt();
        System.out.println("Ingrese el año");
        int anio = reader.nextInt();

        ClaseDate cd = new ClaseDate();

        Date fecha1 = new Date(anio - 1900, mes, dia );

        cd.setFecha(fecha1);

        System.out.println("LA fecha es: " +  cd.getFecha());




    }
}