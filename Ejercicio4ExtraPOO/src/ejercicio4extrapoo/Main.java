package ejercicio4extrapoo;

import Entidades.ClaseNIF;
import Servicios.ServicioNIF;

public class Main {
    public static void main(String[] args) {


        ServicioNIF sn = new ServicioNIF();
        ClaseNIF cn = sn.crearNif();

        sn.mostrar(cn);
    }
}