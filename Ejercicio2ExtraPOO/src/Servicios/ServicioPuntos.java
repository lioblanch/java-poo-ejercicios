package Servicios;

import Entidades.ClasePuntos;

import java.util.Scanner;

public class ServicioPuntos {

    public ClasePuntos crearPuntos() {

        Scanner reader = new Scanner(System.in);

        ClasePuntos cp = new ClasePuntos();

            System.out.println("Vamos a agregar los valores del punto 1" );
            System.out.println("Ingresa el  punto x1: ");
            cp.setX1(reader.nextInt());
            System.out.println("Ingrese el punto y1");
            cp.setY1(reader.nextInt());

            System.out.println("Vamos a agregar los valores del punto 2" );
            System.out.println("Ingresa el  punto x2: ");
            cp.setX2(reader.nextInt());
            System.out.println("Ingrese el punto y2");
            cp.setY2(reader.nextInt());

            return cp;
    }

    public void distanciaPuntos(ClasePuntos cp){

        double val1 = cp.getX2()-cp.getX1();
        double val2 = cp.getY2()-cp.getY1();

        double distancia = Math.sqrt((Math.pow(val1, 2))+(Math.pow(val2, 2)));

        System.out.println("El punto 1 es x1 " + cp.getX1()+ " y1 " + cp.getY1() +
                "\n El punto 2 es x2 " + cp.getX2() + " y2 " + cp.getY2());
        System.out.println("La distancia entre el punto 1 y el punto 2 es: " + distancia);
    }
}
