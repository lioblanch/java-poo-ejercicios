package ejercicio3extrapoo;

import Entidades.ClaseRaices;
import Servicios.ServicioRaices;

public class Main {
    public static void main(String[] args) {

        ServicioRaices sr = new ServicioRaices();
        ClaseRaices cr = sr.crearValores();

        sr.getDiscriminante(cr);
        sr.calcular(cr);


        }
}