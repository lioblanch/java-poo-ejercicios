package ejercicio2extrapoo;

import Entidades.ClasePuntos;
import Servicios.ServicioPuntos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ServicioPuntos sp = new ServicioPuntos();

        ClasePuntos cp = new ClasePuntos();

        cp = sp.crearPuntos();
        sp.distanciaPuntos(cp);
    }
}