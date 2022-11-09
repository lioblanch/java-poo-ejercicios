package Servicios;

import Entidades.Cuenta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ServicioCuenta {
    Scanner reader = new Scanner(System.in);
    public Cuenta altaCuenta(){

        Cuenta c1 = new Cuenta();


        System.out.println("Ingrese el numero de cuenta: ");
        c1.setNumeroCuenta(reader.nextInt());

        System.out.println("Ingrese el dni: ");
        c1.setDni(reader.nextLong());

        System.out.println("Ingrese el saldo actual de la cuenta: ");
        c1.setSaldoActual(reader.nextInt());

        return c1;
    }

    public void menu(Cuenta c1){
        System.out.println("_____________________________");

            System.out.println("SELECCIONE UNA OPCIÓN");
            System.out.println("1. INGRESAR");
            System.out.println("2. RETIRAR");
            System.out.println("3. RETIRO RAPIDO");
            System.out.println("4. CONSULTAR SALDO");
            System.out.println("5. CONSULTAR DATOS");
            System.out.println("6. SALIR");
    }

    public int suma(Cuenta c1){
        System.out.println("Cuanto desea depositar en la cuenta: ");
        int deposito = reader.nextInt();

        return c1.ingresar(deposito);
    }

    public int restar(Cuenta c1){

        System.out.println("Cuanto desea retirar: ");
        int retiro = reader.nextInt();

        return c1.retirar(retiro);
    }

    public int retiroRap(Cuenta c1){

        System.out.println("Retiro rapido solo puedes retirar el 20%: ");
        System.out.println("Cuanto desea retirar: ");
        int retiro = reader.nextInt();

        return c1.retiroRapido(retiro);
    }

    public void consultarSaldo(Cuenta c1){
        System.out.println("_____________________________");
        System.out.println("El saldo actual es de: " + c1.getSaldoActual());
        System.out.println("______________________________");

    }

    public void consultarDator(Cuenta c1){

        System.out.println("_____________________________");
        System.out.println("Datos: " + c1.toString());
        System.out.println("______________________________");
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
