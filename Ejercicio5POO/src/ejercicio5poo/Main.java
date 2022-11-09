/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

*/

package ejercicio5poo;

import Entidades.Cuenta;
import Servicios.ServicioCuenta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ServicioCuenta c1 = new ServicioCuenta();
        Cuenta cas1 = c1.altaCuenta();

        int op;

        do{
            c1.menu(cas1);
            op = reader.nextInt();

            switch (op){

                case 1:
                    c1.suma(cas1);
                    break;
                case 2:
                    c1.restar(cas1);
                    break;

                case 3:
                    c1.retiroRap(cas1);
                    break;
                case 4:
                    c1.consultarSaldo(cas1);
                    break;
                case 5:
                    c1.consultarDator(cas1);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    c1.salto();
                    System.out.println("FIN PROCESO");
                    System.out.println("");
                    break;

            }

        }while (op!=6);
    }
}