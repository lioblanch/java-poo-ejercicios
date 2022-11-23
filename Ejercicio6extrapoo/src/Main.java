import Entidades.ClaseAhorcado;
import Servicios.ServicioAhorcado;

public class Main {
    public static void main(String[] args) {

        ServicioAhorcado sa = new ServicioAhorcado();

        ClaseAhorcado ca = sa.altaAhorcado();

        sa.buscarLetra(ca);

    }
}