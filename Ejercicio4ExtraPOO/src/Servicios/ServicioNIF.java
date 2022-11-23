package Servicios;

import Entidades.ClaseNIF;

import java.util.Scanner;

public class ServicioNIF {

    public ClaseNIF crearNif(){

        Scanner reader = new Scanner(System.in);

        ClaseNIF cn = new ClaseNIF();

        System.out.println("Ingrese su numero de nit: ");
        cn.setDni(reader.nextInt());
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = cn.getDni() % 23;
        cn.setLetra(juegoCaracteres.charAt(modulo));

        return cn;
    }
    public void mostrar(ClaseNIF cn){

        System.out.println("Su codigo NIF es: " + cn.getDni()+"-"+cn.getLetra());

    }
}
