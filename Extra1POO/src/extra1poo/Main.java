package extra1poo;

import Entidades.ClaseFracciones;
import Servicios.ServiciosFracciones;

public class Main {
    public static void main(String[] args) {

        ServiciosFracciones sf = new ServiciosFracciones();
        ClaseFracciones cf = sf.altaFracciones();

        sf.operaciones(cf);

        }
}