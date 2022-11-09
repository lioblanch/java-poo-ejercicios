package Servicios;

import Entidades.ClaseCafetera;

import java.util.Scanner;

public class ServicioCafetera {
    Scanner reader = new Scanner(System.in);
    public ClaseCafetera llenarCafetera(){


        ClaseCafetera c1 = new ClaseCafetera();

        System.out.println("Ingrese la cantidad a llenar en la cafetera: ");
        c1.setCantidadActual(reader.nextFloat());

        c1.llenadoCafetera();

        return c1;
    }

    public void menu(ClaseCafetera c1){

        System.out.println("_____________________________");

        System.out.println("SELECCIONE UNA OPCIÓN");
        System.out.println("1. SERVIR TAZA");
        System.out.println("2. VACIAR CAFETERA");
        System.out.println("3. AGREGAR CAFE");
        System.out.println("4. CANTIDAD DE CAFE EN LA CAFETERA");
        System.out.println("5. SALIR");

    }

    public float servirTaza(ClaseCafetera c1){

        System.out.println("Ingrese cuanto va a servir en la taza");
        float taza = reader.nextInt();

        return c1.servirTaza(taza);
    }

    public void vaciarCafetera(ClaseCafetera c1){

        c1.vaciarCafetera();
    }

    public float agregarCafe(ClaseCafetera c1){

        System.out.println("Ingrese la cantidad de cafe a agregar en la cafetera");
        float taza = reader.nextFloat();

        c1.llenadoCafetera();
        return c1.agregarCafe(taza);
    }

    public void cantidadDeCafe(ClaseCafetera c1){

        System.out.println("La cantidad de cafe en la cafetera es: " + c1.getCantidadActual());

    }
    public void salto(){

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}

