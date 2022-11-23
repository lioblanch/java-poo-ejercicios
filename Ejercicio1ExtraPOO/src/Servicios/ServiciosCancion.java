package Servicios;

import Entidades.ClaseCancion;

import java.util.Scanner;

public class ServiciosCancion {
    public ClaseCancion altaCancion(){

        Scanner reader = new Scanner(System.in);
        ClaseCancion cc = new ClaseCancion();

        System.out.println("Ingrese el titulo de la canción: ");
        cc.setTitulo(reader.nextLine());

        System.out.println("Ingrese el Autor de la canción: ");
        cc.setAutor(reader.nextLine());

        return cc;
    }
}
