package Entidades;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ClaseFraccionarios {

    static Scanner reader = new Scanner(System.in).useDelimiter("\n");

    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;

    public ClaseFraccionarios() {
    }

    public ClaseFraccionarios(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }


    public void rellenarNumeros(){

        System.out.println("Ingrese el numerador 1: ");
        this.numerador1 = reader.nextInt();

        System.out.println("Ingrese el denominador 1: ");
        this.denominador1 = reader.nextInt();

        System.out.println("Ingrese el numerador 2: ");
        this.numerador2 = reader.nextInt();

        System.out.println("Ingrese el denominador 2: ");
        this.denominador2 = reader.nextInt();
    }

    public void menu(){
        int opcion;


        do {



            System.out.println("_________________________________");
            System.out.println("MENÚ DE OPERACIONES FRACCIONARIOS");
            System.out.println("1. Ingresar los valores " + "\n 2. sumar" + "\n 3. restar" + "\n 4. multiplicar "
                    + "\n 5. dividir" + "\n 6. Salir");
            System.out.println("Digite su opción");
            opcion = reader.nextInt();

            switch (opcion) {

                case 1:

                    rellenarNumeros();
                    break;

                case 2:

                    sumarFracciones();
                    break;

                case 3:

                    restarFracciones();
                    break;

                case 4:

                    multiplicarFracciones();
                    break;

                case 5:

                    dividirFracciones();
                    break;

                case 6:

                    System.out.println("_________________" + "\n Finalización del Programa");
                    break;
            }
        }while (opcion !=6);
    }

    public void sumarFracciones(){

        if(this.denominador1 == this.denominador2) {
            System.out.println("La suma del fraccionario " + this.numerador1 + " / " + this.denominador1
                    + " + " + this.numerador2 + " / " + this.denominador2 + " = " + ((this.numerador1 + this.numerador2) + " / " + this.denominador1));
        }else {System.out.println("La suma del fraccionario " + this.numerador1 + " / " + this.denominador1
                + " + " + this.numerador2 + " / " + this.denominador2 + " = " + (((this.numerador1 * this.denominador2) + (this.denominador1 * this.numerador2)) + " / " + (this.denominador1 * this.denominador2)));


        }
    }

    public void restarFracciones(){

        if(this.denominador1 == this.denominador2) {
            System.out.println("La resta del fraccionario " + this.numerador1 + " / " + this.denominador1
                    + " - " + this.numerador2 + " / " + this.denominador2 + " = " + ((this.numerador1 - this.numerador2) + " / " + this.denominador1));
        }else {System.out.println("La resta del fraccionario " + this.numerador1 + " / " + this.denominador1
                + " + " + this.numerador2 + " / " + this.denominador2 + " = " + (((this.numerador1 * this.denominador2) - (this.denominador1 * this.numerador2)) + " / " + (this.denominador1 * this.denominador2)));


        }
    }

    public void multiplicarFracciones(){

        System.out.println("La multiplicación del fraccionario: " + this.numerador1 + "/"+ this.denominador1
                + " * " + this.numerador2 + " / " + this.denominador2 + " = " + (this.numerador1 * this.numerador2) + " / " +
                (this.denominador1 * this.denominador2));
    }

    public void dividirFracciones(){

        System.out.println("La división del fraccionario: " + this.numerador1 + "/"+ this.denominador1
                + " // " + this.numerador2 + " / " + this.denominador2 + " = " + (this.numerador1 * this.denominador2) + " / " +
                (this.denominador1 * this.numerador2));
    }


}
