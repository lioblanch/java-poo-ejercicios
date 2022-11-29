/*


Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */



package fraccionarios;

import Entidades.ClaseFraccionarios;

public class Main {
    public static void main(String[] args) {

        ClaseFraccionarios cf = new ClaseFraccionarios();

        cf.rellenarNumeros();
        cf.menu();
    }
}