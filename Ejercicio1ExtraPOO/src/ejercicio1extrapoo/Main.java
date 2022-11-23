package ejercicio1extrapoo;

import Entidades.ClaseCancion;
import Servicios.ServiciosCancion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de canciones a registrar: ");
        int cantidadCanciones = reader.nextInt();
        ServiciosCancion sc = new ServiciosCancion();
        ClaseCancion cc[] = new ClaseCancion[cantidadCanciones];

        for (int i = 0;i<cc.length; i++){

            cc[i]=sc.altaCancion();

            System.out.println(cc[i].toString());
        }

    }
}